import ij.*;
import ij.IJ;
import ij.ImagePlus;
import ij.process.*;
import ij.gui.*;
import ij.plugin.filter.*;

/**
 * Die Klasse Hausarbeit_Jenna_Lee_Melinkat_PlugInFilter_ implementiert das Interface
 * ij.plugin.PlugInFilter. Es soll vorher in ImageJ geladene Bilder analysieren und die Bewegung
 * und Flugbahn folgend darstellen.
 *
 *
 * @author Jenna-Lee Melinkat
 */

public class Hausarbeit_Jenna_Lee_Melinkat_PlugInFilter_ implements PlugInFilter {
    ImagePlus imp;

    /**
     * Die setup Methode wird aufgerufen, um die Anwendbarkeit des Plugins auf die jeweils ausgewaehlten
     * Bilder zu ueberpruefen und ist nur auf 8-Bit Graustufenbilder anwendbar.
     */

    /**
     * Die Methode Setup wird aufgerufen, zur Initialisierung des Filters.
     *
     * @param imp enthält entweder ein ImageProcessor-Objekt oder ein
     * ImageStack-Objekt
     * @param arg ein Zeichenkettenargument
     * @return    Flag, dass die Fähigkeiten des Plug-ins festlegt.
     */
    public int setup(String arg, ImagePlus imp) {
//this.imp = imp;
        return DOES_8G;	// Der Filter verarbeitet nur 8-Bit-Graustufenbilder anernfalls DOES_ALL
    }

    /**
     * Die Methode run wird nach setup aufgerufen und erhält als
     * Parameter den ImageProcessor des zu verarbeitenden Bildes.
     * Ist statt eines einzelnen Bildes ein ImageStack-Objekt zu filtern,
     * so wird run für jedes im Stapel enthaltene Bild einzeln aufgerufen.
     *
     * @param ip ImageProcessor des zu verarbeitenden Bildes.
     */
    public void run(ImageProcessor ip) {



        public void run(ImageProcessor ip) {
            ip.invert();
        }

    }
