
import turtle

t=turtle.Turtle()
sc=turtle.Screen()
sc.setup(700,700)
sc.bgcolor('black')
col=('yellow','red','cyan','purple')
t.speed(0)
    
for c in range (60):
    t.pencolor(col[c%4])
    t.width(2)
    t.forward(c)
    t.circle(90,steps=5)
    t.forward(c)
    t.right(45)

turtle.exitonclick() 