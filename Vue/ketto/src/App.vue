<template>
  <h1 v-bind="cimAttr">
    Első <a :href="link" target="_blank"> Vue.js </a> projekt
  </h1>
  <ol>
    <li v-for="fruit in fruits">{{ fruit }}</li>
  </ol>
  <p v-if="latszik">Látom</p>
  <p v-else>Nem látom</p>
  <button v-on:click="latszik = ! latszik">Látszik vagy sem</button>
  <!-- <TheWelcome/> -->
<img :src="'kephelye'"></img>
</template>

<script setup>
import { ref } from "vue";
import TheWelcome from "./components/TheWelcome.vue";
let kephelye = './src/assets/logo.svg'
const latszik = ref(true);
let link = "https://vuejs.org";
let cimAttr = {
  id: "cim",
  class: "kozepre",
  style: "color : brown",
};
let fruits = ["szőlő", "szilva", "körte", "birsalma"];
</script>

<style scoped>
.kozepre {
  text-align: center;
}
</style>
