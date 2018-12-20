<%@ taglib prefix="v-on" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: zhihong.wan
  Date: 2018/7/27
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vue-2</title>
</head>
<script src="https://cdn.jsdelivr.net/npm/axios@0.12.0/dist/axios.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/lodash@4.13.1/lodash.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<body>
<div id="todo-list-example">
    <form v-on:v-on:submit.prevent="addNewTodo">
        <label for="new-todo">Add a todo</label>
        <input
                v-model="newTodoText"
                id="new-todo"
                placeholder="E.g. Feed the cat"
        >
        <button>Add</button>
    </form>
    <ul>
        <li
                is="todo-item"
                v-for="(todo, index) in todos"
                v-bind:key="todo.id"
                v-bind:title="todo.title"
                v-on:remove="todos.splice(index, 1)"
        ></li>
    </ul>

    <script>
        Vue.component('todo-item', {
            template: '\
    <li>\
      {{ title }}\
      <button v-on:click="$emit(\'remove\')">Remove</button>\
    </li>\
  ',
            props: ['title']
        })

        new Vue({
            el: '#todo-list-example',
            data: {
                newTodoText: '',
                todos: [
                    {
                        id: 1,
                        title: 'Do the dishes',
                    },
                    {
                        id: 2,
                        title: 'Take out the trash',
                    },
                    {
                        id: 3,
                        title: 'Mow the lawn'
                    }
                ],
                nextTodoId: 4
            },
            methods: {
                addNewTodo: function () {
                    this.todos.push({
                        id: this.nextTodoId++,
                        title: this.newTodoText
                    })
                    this.newTodoText = ''
                }
            }
        })
    </script>
</div>
</body>
</html>
