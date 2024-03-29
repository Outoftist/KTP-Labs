import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator {
    // Константа с максимальным количеством интераций
    public static final int MAX_ITERATIONS = 2000;

    /**
     *  Переопределение метода установки начальных значений для формулы расчета
     */
    @Override
    public void getInitialRange(Rectangle2D.Double range) {
        // В соответствии с начальным диапазоном в (-2 - 1.5i) - (1 + 1.5i):
        range.x = -2;
        range.y = -1.5;
        range.width = 3;
        range.height = 3;
    }

    /**
     * Переопределение метода, рассчитывающего количество итераций для пикселей
     */
    @Override
    public int numIterations(double x, double y) {
        int counter = 0;
        // Действительная часть комплексного числа
        double real = 0;
        // Мнимая часть
        double imaginary = 0;
        double z_n2 = 0;

        // Основная формула для построения фрактала Мандельброта
        // Модуль комплексного числа должне не превышать 2
        while (counter < MAX_ITERATIONS && z_n2 < 4) {
            // zn = z(n - 1)^2 + c = (real + image)^2 + c = real^2 + 2real*image - image^2 + c
            counter++;

            double nextRe = real  * real - imaginary * imaginary + x;
            double nextIm = 2 * real * imaginary + y;

            z_n2 = nextRe * nextRe + nextIm * nextIm;

            real = nextRe;
            imaginary = nextIm;
        }

        // Если счетчик не дойдет до максимума - вернем его значение, иначе -1 (черный цвет)
        return counter < MAX_ITERATIONS ? counter : -1;
    }

    public String toString() {
        return "Mandelbrot"; // Возвращает название фрактала
    }
}
