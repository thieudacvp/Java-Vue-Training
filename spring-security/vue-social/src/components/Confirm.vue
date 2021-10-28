<template>
    <div>
    </div>
</template>
<script>
export default {
    data() {
        return{
            user: {},
            img: ""
        }
    },
    methods: {

    },
    created() {
    let token = this.$route.query.token
    if(token) {
        localStorage.setItem("access-token", token)
        this.$router.push({
            name: "profile"
        })
    }else{
        alert("please login !")
        this.$router.push({
            name: "/"
        })
    }
  },

}
</script>