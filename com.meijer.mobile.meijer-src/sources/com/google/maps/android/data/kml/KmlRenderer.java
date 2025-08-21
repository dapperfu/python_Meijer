package com.google.maps.android.data.kml;

import Md.C4110c;
import Od.C4455c;
import Od.C4462j;
import Od.C4466n;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Geometry;
import com.google.maps.android.data.MultiGeometry;
import com.google.maps.android.data.Renderer;
import io.constructor.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class KmlRenderer extends Renderer {
    private static final String LOG_TAG = "KmlRenderer";
    private ArrayList<KmlContainer> mContainers;
    private boolean mGroundOverlayImagesDownloaded;
    private final Set<String> mGroundOverlayUrls;
    private boolean mMarkerIconsDownloaded;

    private class GroundOverlayImageDownload extends AsyncTask<String, Void, Bitmap> {
        private final String mGroundOverlayUrl;

        public GroundOverlayImageDownload(String str) {
            this.mGroundOverlayUrl = str;
            KmlRenderer.this.downloadStarted();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Bitmap doInBackground(String... strArr) {
            try {
                return KmlRenderer.this.getBitmapFromUrl(this.mGroundOverlayUrl);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.mGroundOverlayUrl);
            } catch (IOException e10) {
                FS.log_e(KmlRenderer.LOG_TAG, "Image [" + this.mGroundOverlayUrl + "] download issue", e10);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                FS.log_e(KmlRenderer.LOG_TAG, "Image at this URL could not be found " + this.mGroundOverlayUrl);
            } else {
                KmlRenderer.this.cacheBitmap(this.mGroundOverlayUrl, bitmap);
                if (KmlRenderer.this.isLayerOnMap()) {
                    KmlRenderer kmlRenderer = KmlRenderer.this;
                    kmlRenderer.addGroundOverlayToMap(this.mGroundOverlayUrl, kmlRenderer.getGroundOverlayMap(), true);
                    KmlRenderer kmlRenderer2 = KmlRenderer.this;
                    kmlRenderer2.addGroundOverlayInContainerGroups(this.mGroundOverlayUrl, kmlRenderer2.mContainers, true);
                }
            }
            KmlRenderer.this.downloadFinished();
        }
    }

    private class MarkerIconImageDownload extends AsyncTask<String, Void, Bitmap> {
        private final String mIconUrl;

        public MarkerIconImageDownload(String str) {
            this.mIconUrl = str;
            KmlRenderer.this.downloadStarted();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Bitmap doInBackground(String... strArr) {
            try {
                return KmlRenderer.this.getBitmapFromUrl(this.mIconUrl);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.mIconUrl);
            } catch (IOException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                FS.log_e(KmlRenderer.LOG_TAG, "Image at this URL could not be found " + this.mIconUrl);
            } else {
                KmlRenderer.this.cacheBitmap(this.mIconUrl, bitmap);
                if (KmlRenderer.this.isLayerOnMap()) {
                    KmlRenderer kmlRenderer = KmlRenderer.this;
                    kmlRenderer.addIconToMarkers(this.mIconUrl, kmlRenderer.getAllFeatures());
                    KmlRenderer kmlRenderer2 = KmlRenderer.this;
                    kmlRenderer2.addContainerGroupIconsToMarkers(this.mIconUrl, kmlRenderer2.mContainers);
                }
            }
            KmlRenderer.this.downloadFinished();
        }
    }

    private void addGroundOverlays(HashMap<KmlGroundOverlay, C4462j> map, Iterable<KmlContainer> iterable) {
        addGroundOverlays(map);
        for (KmlContainer kmlContainer : iterable) {
            addGroundOverlays(kmlContainer.getGroundOverlayHashMap(), kmlContainer.getContainers());
        }
    }

    private void addIconToMarker(String str, KmlStyle kmlStyle, KmlStyle kmlStyle2, C4466n c4466n) {
        boolean z10 = false;
        boolean z11 = kmlStyle2 != null && str.equals(kmlStyle2.getIconUrl());
        if (kmlStyle != null && str.equals(kmlStyle.getIconUrl())) {
            z10 = true;
        }
        if (z11) {
            scaleBitmap(kmlStyle2, c4466n);
        } else if (z10) {
            scaleBitmap(kmlStyle, c4466n);
        }
    }

    private void downloadGroundOverlays() {
        this.mGroundOverlayImagesDownloaded = true;
        Iterator<String> it = this.mGroundOverlayUrls.iterator();
        while (it.hasNext()) {
            new GroundOverlayImageDownload(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    private void downloadMarkerIcons() {
        this.mMarkerIconsDownloaded = true;
        Iterator<String> it = getMarkerIconUrls().iterator();
        while (it.hasNext()) {
            new MarkerIconImageDownload(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    private InputStream openConnectionCheckRedirects(URLConnection uRLConnection) throws IOException {
        InputStream inputStream;
        boolean z10;
        HttpURLConnection httpURLConnection;
        int responseCode;
        int i10 = 0;
        do {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).setInstanceFollowRedirects(false);
            }
            inputStream = uRLConnection.getInputStream();
            if (!(uRLConnection instanceof HttpURLConnection) || (responseCode = (httpURLConnection = (HttpURLConnection) uRLConnection).getResponseCode()) < 300 || responseCode > 307 || responseCode == 306 || responseCode == 304) {
                z10 = false;
            } else {
                URL url = httpURLConnection.getURL();
                String headerField = httpURLConnection.getHeaderField("Location");
                URL url2 = headerField != null ? new URL(url, headerField) : null;
                httpURLConnection.disconnect();
                if (url2 == null || (!(url2.getProtocol().equals("http") || url2.getProtocol().equals(BuildConfig.SERVICE_SCHEME)) || i10 >= 5)) {
                    throw new SecurityException("illegal URL redirect");
                }
                uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(url2.openConnection()));
                i10++;
                z10 = true;
            }
        } while (z10);
        return inputStream;
    }

    public void addLayerToMap() {
        setLayerVisibility(true);
        this.mContainers = getContainerList();
        putStyles();
        assignStyleMap(getStyleMaps(), getStylesRenderer());
        addGroundOverlays(getGroundOverlayMap(), this.mContainers);
        addContainerGroupToMap(this.mContainers, true);
        addPlacemarksToMap(getAllFeatures());
        if (!this.mGroundOverlayImagesDownloaded) {
            downloadGroundOverlays();
        }
        if (!this.mMarkerIconsDownloaded) {
            downloadMarkerIcons();
        }
        checkClearBitmapCache();
    }

    private void addIconToGeometry(String str, KmlStyle kmlStyle, KmlStyle kmlStyle2, Geometry geometry, Object obj) {
        if (geometry == null) {
            return;
        }
        if ("Point".equals(geometry.getGeometryType())) {
            addIconToMarker(str, kmlStyle, kmlStyle2, (C4466n) obj);
        } else if ("MultiGeometry".equals(geometry.getGeometryType())) {
            addIconToMultiGeometry(str, kmlStyle, kmlStyle2, (MultiGeometry) geometry, (List) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap getBitmapFromUrl(String str) throws IOException {
        return BitmapFactory.decodeStream(openConnectionCheckRedirects((URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(new URL(str).openConnection()))));
    }

    static boolean getContainerVisibility(KmlContainer kmlContainer, boolean z10) {
        return z10 && (!kmlContainer.hasProperty("visibility") || Integer.parseInt(kmlContainer.getProperty("visibility")) != 0);
    }

    public Iterable<KmlContainer> getNestedContainers() {
        return this.mContainers;
    }

    public boolean hasNestedContainers() {
        return this.mContainers.size() > 0;
    }

    KmlRenderer(C4110c c4110c, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, Renderer.ImagesCache imagesCache) {
        super(c4110c, context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache);
        this.mGroundOverlayUrls = new HashSet();
        this.mMarkerIconsDownloaded = false;
        this.mGroundOverlayImagesDownloaded = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContainerGroupIconsToMarkers(String str, Iterable<KmlContainer> iterable) {
        for (KmlContainer kmlContainer : iterable) {
            addIconToMarkers(str, kmlContainer.getPlacemarksHashMap());
            if (kmlContainer.hasContainers()) {
                addContainerGroupIconsToMarkers(str, kmlContainer.getContainers());
            }
        }
    }

    private void addContainerGroupToMap(Iterable<KmlContainer> iterable, boolean z10) throws NumberFormatException {
        for (KmlContainer kmlContainer : iterable) {
            boolean containerVisibility = getContainerVisibility(kmlContainer, z10);
            if (kmlContainer.getStyles() != null) {
                putStyles(kmlContainer.getStyles());
            }
            if (kmlContainer.getStyleMap() != null) {
                super.assignStyleMap(kmlContainer.getStyleMap(), getStylesRenderer());
            }
            addContainerObjectToMap(kmlContainer, containerVisibility);
            if (kmlContainer.hasContainers()) {
                addContainerGroupToMap(kmlContainer.getContainers(), containerVisibility);
            }
        }
    }

    private void addContainerObjectToMap(KmlContainer kmlContainer, boolean z10) throws NumberFormatException {
        boolean z11;
        for (KmlPlacemark kmlPlacemark : kmlContainer.getPlacemarks()) {
            boolean placemarkVisibility = Renderer.getPlacemarkVisibility(kmlPlacemark);
            if (z10 && placemarkVisibility) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = z11;
            if (kmlPlacemark.getGeometry() != null) {
                KmlPlacemark kmlPlacemark2 = kmlPlacemark;
                Object objAddKmlPlacemarkToMap = addKmlPlacemarkToMap(kmlPlacemark2, kmlPlacemark.getGeometry(), getPlacemarkStyle(kmlPlacemark.getId()), kmlPlacemark2.getInlineStyle(), z12);
                kmlContainer.setPlacemark(kmlPlacemark2, objAddKmlPlacemarkToMap);
                putContainerFeature(objAddKmlPlacemarkToMap, kmlPlacemark);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroundOverlayInContainerGroups(String str, Iterable<KmlContainer> iterable, boolean z10) {
        for (KmlContainer kmlContainer : iterable) {
            boolean containerVisibility = getContainerVisibility(kmlContainer, z10);
            addGroundOverlayToMap(str, kmlContainer.getGroundOverlayHashMap(), containerVisibility);
            if (kmlContainer.hasContainers()) {
                addGroundOverlayInContainerGroups(str, kmlContainer.getContainers(), containerVisibility);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroundOverlayToMap(String str, HashMap<KmlGroundOverlay, C4462j> map, boolean z10) {
        C4455c cachedGroundOverlayImage = getCachedGroundOverlayImage(str);
        for (KmlGroundOverlay kmlGroundOverlay : map.keySet()) {
            if (kmlGroundOverlay.getImageUrl().equals(str)) {
                C4462j c4462jAttachGroundOverlay = attachGroundOverlay(kmlGroundOverlay.getGroundOverlayOptions().c2(cachedGroundOverlayImage));
                if (!z10) {
                    c4462jAttachGroundOverlay.k(false);
                }
                map.put(kmlGroundOverlay, c4462jAttachGroundOverlay);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIconToMarkers(String str, HashMap<KmlPlacemark, Object> map) {
        for (KmlPlacemark kmlPlacemark : map.keySet()) {
            addIconToGeometry(str, getStylesRenderer().get(kmlPlacemark.getId()), kmlPlacemark.getInlineStyle(), kmlPlacemark.getGeometry(), map.get(kmlPlacemark));
        }
    }

    private void addIconToMultiGeometry(String str, KmlStyle kmlStyle, KmlStyle kmlStyle2, MultiGeometry multiGeometry, List<Object> list) {
        Iterator<Geometry> it = multiGeometry.getGeometryObject().iterator();
        Iterator<Object> it2 = list.iterator();
        while (it.hasNext() && it2.hasNext()) {
            addIconToGeometry(str, kmlStyle, kmlStyle2, it.next(), it2.next());
        }
    }

    private void addPlacemarksToMap(HashMap<? extends Feature, Object> map) {
        Iterator<? extends Feature> it = map.keySet().iterator();
        while (it.hasNext()) {
            addFeature(it.next());
        }
    }

    private void removeContainers(Iterable<KmlContainer> iterable) {
        for (KmlContainer kmlContainer : iterable) {
            removePlacemarks(kmlContainer.getPlacemarksHashMap());
            removeGroundOverlays(kmlContainer.getGroundOverlayHashMap());
            removeContainers(kmlContainer.getContainers());
        }
    }

    private void removePlacemarks(HashMap<? extends Feature, Object> map) {
        removeFeatures(map);
    }

    private void scaleBitmap(KmlStyle kmlStyle, C4466n c4466n) {
        c4466n.l(getCachedMarkerImage(kmlStyle.getIconUrl(), kmlStyle.getIconScale()));
    }

    public Iterable<KmlGroundOverlay> getGroundOverlays() {
        return getGroundOverlayMap().keySet();
    }

    Iterable<? extends Feature> getKmlPlacemarks() {
        return getFeatures();
    }

    boolean hasKmlPlacemarks() {
        return hasFeatures();
    }

    public void removeLayerFromMap() {
        removePlacemarks(getAllFeatures());
        removeGroundOverlays(getGroundOverlayMap());
        if (hasNestedContainers()) {
            removeContainers(getNestedContainers());
        }
        setLayerVisibility(false);
        clearStylesRenderer();
    }

    @Override // com.google.maps.android.data.Renderer
    public void setMap(C4110c c4110c) {
        removeLayerFromMap();
        super.setMap(c4110c);
        addLayerToMap();
    }

    void storeKmlData(HashMap<String, KmlStyle> map, HashMap<String, String> map2, HashMap<KmlPlacemark, Object> map3, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, C4462j> map4) {
        storeData(map, map2, map3, arrayList, map4);
    }

    void storeKmzData(HashMap<String, KmlStyle> map, HashMap<String, String> map2, HashMap<KmlPlacemark, Object> map3, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, C4462j> map4, HashMap<String, Bitmap> map5) {
        storeData(map, map2, map3, arrayList, map4);
        for (Map.Entry<String, Bitmap> entry : map5.entrySet()) {
            cacheBitmap(entry.getKey(), entry.getValue());
        }
    }

    private void addGroundOverlays(HashMap<KmlGroundOverlay, C4462j> map) {
        for (KmlGroundOverlay kmlGroundOverlay : map.keySet()) {
            String imageUrl = kmlGroundOverlay.getImageUrl();
            if (imageUrl != null && kmlGroundOverlay.getLatLngBox() != null) {
                if (getCachedGroundOverlayImage(imageUrl) != null) {
                    addGroundOverlayToMap(imageUrl, map, true);
                } else {
                    this.mGroundOverlayUrls.add(imageUrl);
                }
            }
        }
    }
}
