import java.awt.geom.Rectangle2D;

/**
 *  Данный класс предоставляет собой простейший интерфейс и операции
 *   для создания фрактала, который можно изучить с помощью класса Fractal Explorer.
 */
public abstract class FractalGenerator {

    /**
     *  Эта статичная функция-помощник принимает целочисленную координату и превращает ее в
     *  double в соответствии с определенными ограничениями. Это используется, чтобы
     *  конвертировать координаты пикселя в double для вычисления фракталов.
     */
    public static double getCoord(double rangeMin, double rangeMax, int size, int coord) {

        assert size > 0;
        assert coord >= 0 && coord < size;

        double range = rangeMax - rangeMin;
        return rangeMin + (range *(double) coord / (double) size);
    }

    /**
     *  Определяет треугольник для определения начального промежутка
     *  для генерации фрактала
     */
    public abstract void getInitialRange(Rectangle2D.Double range);

    /**
     *   Обновляет текущий промежуток для приближения к нужным координатам
     *   и увеличивает его или уменьшает в зависимости от коэффициента масштабирования.
     */
    public void recenterAndZoomRange(Rectangle2D.Double range, double centerX, double centerY, double scale) {
        double newWidth = range.width * scale;
        double newHeight = range.height * scale;

        range.x = centerX - newWidth / 2;
        range.y = centerY - newHeight / 2;
        range.width = newWidth;
        range.height = newHeight;
    }

    public abstract int numIterations(double x, double y);
}
