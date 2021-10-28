<template>
    <div>
        <h1> {{user.email}}</h1>
        <img :src=img width="100" height="100">
        <button @click="logout">Logout</button>
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
        logout() {
            localStorage.removeItem("access-token");
            this.$router.push({
            name: "/"
        })
        }
    },
    created() {
        let token = localStorage.getItem("access-token")
        axios.get("http://localhost:8080/user/me", {
            headers: {
                authorization : "Bearer " + token
            }
        }).then((res) => {
            this.user = res.data
            this.img = res.data.imageUrl
        })
    }
}
</script>