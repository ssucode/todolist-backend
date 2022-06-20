package com.ssucode.todolist.repository

import org.hibernate.annotations.ColumnDefault
import javax.persistence.*

@Entity
class Todo (
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    var id: Long? = null,

    @Column(nullable = false)
    @ColumnDefault("false")
    var completed: Boolean = false,

    @Column(nullable = false)
    var todoName: String
)