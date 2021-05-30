import turtle

t=turtle.Turtle()
screen=turtle.Screen()
screen.bgcolor('black')
t.speed(0)
screen.setup(600,600)
col=('pink','aqua','indigo','snow')

for c in range (250):
    t.pencolor(col[c%4])
    t.width(2)
    t.forward(c)
    t.right(89)
    t.forward(c*2)
    t.right(89)

turtle.exitonclick()    