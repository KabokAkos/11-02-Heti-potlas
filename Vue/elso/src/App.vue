<template>
  <h1>Első Vue.js oldal</h1>
  <Sajat />
  <p>1 + 1 ={{ 1 + 1 }}</p>
  <p>{{ true ? "Igaz" : "Hamis" }}</p>
  <p>{{ false ? "Igaz" : "Hamis" }}</p>
  <div v-html="html" :class="uLine" v-if="true"></div>
</template>
<script setup>
import { ref } from "vue";
import Sajat from "./components/Sajat.vue";

const html = ref("<p>Új bekezdés</p>");
const uLine = ref('alahuzott')
</script>

<style scoped>
h1 {
  text-align: center;
}
.alahuzott{
  text-decoration: underline;
}
</style>
