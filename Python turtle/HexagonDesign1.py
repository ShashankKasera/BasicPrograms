import turtle
t=turtle.Turtle()
sc=turtle.Screen()
sc.setup(700,700)
sc.bgcolor('black')
col=('pink','aqua','indigo','snow')
t.speed(0)
    
for b in range(150):
        t.pencolor(col[b%4])
        t.width(5)
        t.forward(b*2)
        t.right(300)

turtle.exitonclick() 