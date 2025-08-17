package com.google.maps.android.data.kml;

import Kd.C3945c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fullstory.FS;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Layer;
import com.google.maps.android.data.Renderer;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes7.dex */
public class KmlLayer extends Layer {
    public KmlLayer(C3945c c3945c, int i10, Context context) throws XmlPullParserException, IOException {
        this(c3945c, context.getResources().openRawResource(i10), context, new MarkerManager(c3945c), new PolygonManager(c3945c), new PolylineManager(c3945c), new GroundOverlayManager(c3945c), (Renderer.ImagesCache) null);
    }

    public KmlLayer(C3945c c3945c, InputStream inputStream, Context context) throws XmlPullParserException, IOException {
        this(c3945c, inputStream, context, new MarkerManager(c3945c), new PolygonManager(c3945c), new PolylineManager(c3945c), new GroundOverlayManager(c3945c), (Renderer.ImagesCache) null);
    }

    public KmlLayer(C3945c c3945c, int i10, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, Renderer.ImagesCache imagesCache) throws XmlPullParserException, IOException {
        this(c3945c, context.getResources().openRawResource(i10), context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache);
    }

    private static XmlPullParser createXmlParser(InputStream inputStream) throws XmlPullParserException {
        XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
        xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        return xmlPullParserNewPullParser;
    }

    private static KmlParser parseKml(InputStream inputStream) throws XmlPullParserException, IOException {
        KmlParser kmlParser = new KmlParser(createXmlParser(inputStream));
        kmlParser.parseKml();
        return kmlParser;
    }

    @Override // com.google.maps.android.data.Layer
    public void addLayerToMap() {
        super.addKMLToMap();
    }

    @Override // com.google.maps.android.data.Layer
    public Iterable<KmlContainer> getContainers() {
        return super.getContainers();
    }

    @Override // com.google.maps.android.data.Layer
    public Iterable<KmlGroundOverlay> getGroundOverlays() {
        return super.getGroundOverlays();
    }

    public Iterable<KmlPlacemark> getPlacemarks() {
        return getFeatures();
    }

    @Override // com.google.maps.android.data.Layer
    public boolean hasContainers() {
        return super.hasContainers();
    }

    public boolean hasPlacemarks() {
        return hasFeatures();
    }

    public KmlLayer(C3945c c3945c, InputStream inputStream, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, Renderer.ImagesCache imagesCache) throws XmlPullParserException, IOException {
        if (inputStream != null) {
            KmlRenderer kmlRenderer = new KmlRenderer(c3945c, context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(1024);
            ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    HashMap<String, Bitmap> map = new HashMap<>();
                    KmlParser kml = null;
                    while (nextEntry != null) {
                        if (kml == null && nextEntry.getName().toLowerCase().endsWith(".kml")) {
                            kml = parseKml(zipInputStream);
                        } else {
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(zipInputStream);
                            if (bitmapDecodeStream != null) {
                                map.put(nextEntry.getName(), bitmapDecodeStream);
                            } else {
                                FS.log_w("KmlLayer", "Unsupported KMZ contents file type: " + nextEntry.getName());
                            }
                        }
                        nextEntry = zipInputStream.getNextEntry();
                    }
                    if (kml != null) {
                        kmlRenderer.storeKmzData(kml.getStyles(), kml.getStyleMaps(), kml.getPlacemarks(), kml.getContainers(), kml.getGroundOverlays(), map);
                    } else {
                        throw new IllegalArgumentException("KML not found in InputStream");
                    }
                } else {
                    bufferedInputStream.reset();
                    KmlParser kml2 = parseKml(bufferedInputStream);
                    kmlRenderer.storeKmlData(kml2.getStyles(), kml2.getStyleMaps(), kml2.getPlacemarks(), kml2.getContainers(), kml2.getGroundOverlays());
                    kmlRenderer = kmlRenderer;
                }
                storeRenderer(kmlRenderer);
                inputStream.close();
                bufferedInputStream.close();
                zipInputStream.close();
                return;
            } catch (Throwable th2) {
                inputStream.close();
                bufferedInputStream.close();
                zipInputStream.close();
                throw th2;
            }
        }
        throw new IllegalArgumentException("KML InputStream cannot be null");
    }
}
