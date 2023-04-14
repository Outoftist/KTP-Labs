import javax.swing.JComponent;
import java.awt.image.BufferedImage;
import java.awt.Dimension;
import java.awt.Graphics;

public class JImageDisplay extends JComponent {
    /**
     *  Экземпляр буферизированного изображения
     *  Управляет изображением, которое мы можем отрисовывать
     *
     */
    private  BufferedImage showImage;
    /**
     *  Конструктор, принимающий ширину и высоту изображения, после
     *  чего инициализирующий объекст с такими шириной и высотой
     *
     */
    public JImageDisplay(int width, int height) {
        //
        this.showImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        //
        super.setPreferredSize(new Dimension(width, height));
    }

    /**
     * Переопределенный метод. Вывод изображения на экран
     */

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(showImage, 0, 0, showImage.getWidth(), showImage.getHeight(), null);
    }

    /**
     *  Метод который устанавливает все пиксели изображение в черный цвет
     */
    public void clearImage() {
        // пробегаемя по высоте и ширине
        for  (int i = 0; i < showImage.getHeight(); i++) {
            for (int j = 0; j < showImage.getWidth(); j++) {
                // с помощью метода drawPixel красим пиксели в черный
                this.drawPixel(i,j,0);
            }
        }
    }

    /**
     *  Метод, который устанавливает пиксель в определенный цвет
     *
     */
    public void drawPixel(int x, int y, int rgbColor) {
        showImage.setRGB(x, y, rgbColor);
    }
}
