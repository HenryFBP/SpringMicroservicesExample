<template>
  <form @submit="onSubmit" class="add-form">
    <div class="form-control">
      <label>Name</label>
      <input type="text" v-model="name" name="name" placeholder="Enter Your Name"/>
    </div>
    <div class="form-control">
      <label>Age</label>
      <input
          type="text"
          v-model="age"
          name="age"
          placeholder="Enter Your Age"
      />
    </div>
    <input type="submit" value="Save Information" class="btn btn-block"/>
  </form>
</template>

<script>
export default {
  name: 'AddInformation',
  data() {
    return {
      name: '',
      age: '',
    }
  },
  methods: {
    onSubmit(e) {
      e.preventDefault()
      if (!this.name) {
        alert('Please Add a Name')
        return
      }

      const newInformation = {
        id: Math.floor(Math.random() * 100000),
        name: this.name,
        age: this.age,
        reminder: this.reminder
      }
      this.$emit('add-information', newInformation)
      this.name = ' '
      this.age = ' '
    }
  }
}
</script>

<style scoped>

</style>
