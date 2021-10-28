<template>
    <div>
        <h1> {{user.email}}</h1>
        <img :src=img width="100" height="100">
    </div>
</template>
<script>
import axios from 'axios'
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
        axios.get("http://localhost:8080/user/me", {
            headers: {
                authorization : "Bearer " + token
            }
        }).then((res) => {
            this.user = res.data
            this.img = res.data.imageUrl
                    })
    }else{
        alert("please login !")
        this.$router.push({
            name: '/'
        })
    }
  },

}
</script>