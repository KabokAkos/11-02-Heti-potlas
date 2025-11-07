<template>
  <div class="container">
      <h1>Calculator</h1>
          <input type="text" v-model="screen"></input>
      <div class="row">
        <button @click="btnClick(b)" v-for="(n, b) in 10" class="col-3 btn btn-outline-secondary">{{ b }}</button>
        <button @click="btnClick(b)" v-for=" b in btns" class="col-3 btn btn-outline-secondary">{{b}}</button>
      </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';

let btns = ["+", "-", "/", "*", "C", "="];
const screen = ref(0)
const btnClick = (val) =>{
    console.log(val)
}
</script>
