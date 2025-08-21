package com.google.maps.android.data;

import Md.C4110c;
import Od.C4455c;
import Od.C4456d;
import Od.C4462j;
import Od.C4463k;
import Od.C4466n;
import Od.C4467o;
import Od.C4470s;
import Od.C4471t;
import Od.C4472u;
import Od.C4473v;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.R;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Layer;
import com.google.maps.android.data.geojson.BiMultiMap;
import com.google.maps.android.data.geojson.GeoJsonFeature;
import com.google.maps.android.data.geojson.GeoJsonGeometryCollection;
import com.google.maps.android.data.geojson.GeoJsonLineString;
import com.google.maps.android.data.geojson.GeoJsonLineStringStyle;
import com.google.maps.android.data.geojson.GeoJsonMultiLineString;
import com.google.maps.android.data.geojson.GeoJsonMultiPoint;
import com.google.maps.android.data.geojson.GeoJsonMultiPolygon;
import com.google.maps.android.data.geojson.GeoJsonPoint;
import com.google.maps.android.data.geojson.GeoJsonPointStyle;
import com.google.maps.android.data.geojson.GeoJsonPolygon;
import com.google.maps.android.data.geojson.GeoJsonPolygonStyle;
import com.google.maps.android.data.kml.KmlContainer;
import com.google.maps.android.data.kml.KmlGroundOverlay;
import com.google.maps.android.data.kml.KmlMultiGeometry;
import com.google.maps.android.data.kml.KmlPlacemark;
import com.google.maps.android.data.kml.KmlPolygon;
import com.google.maps.android.data.kml.KmlStyle;
import com.google.maps.android.data.kml.KmlUtil;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class Renderer {
    private static final Object FEATURE_NOT_ON_MAP = null;
    private static final int MARKER_ICON_SIZE = 32;
    private static final DecimalFormat sScaleFormat = new DecimalFormat("#.####");
    private final BiMultiMap<Feature> mContainerFeatures;
    private ArrayList<KmlContainer> mContainers;
    private Context mContext;
    private final GeoJsonLineStringStyle mDefaultLineStringStyle;
    private final GeoJsonPointStyle mDefaultPointStyle;
    private final GeoJsonPolygonStyle mDefaultPolygonStyle;
    private final BiMultiMap<Feature> mFeatures;
    private HashMap<KmlGroundOverlay, C4462j> mGroundOverlayMap;
    private final GroundOverlayManager.Collection mGroundOverlays;
    private ImagesCache mImagesCache;
    private boolean mLayerOnMap;
    private C4110c mMap;
    private final Set<String> mMarkerIconUrls;
    private final MarkerManager.Collection mMarkers;
    private int mNumActiveDownloads;
    private final PolygonManager.Collection mPolygons;
    private final PolylineManager.Collection mPolylines;
    private HashMap<String, String> mStyleMaps;
    private HashMap<String, KmlStyle> mStyles;
    private HashMap<String, KmlStyle> mStylesRenderer;

    public static final class ImagesCache {
        final Map<String, Map<String, C4455c>> markerImagesCache = new HashMap();
        final Map<String, C4455c> groundOverlayImagesCache = new HashMap();
        final Map<String, Bitmap> bitmapCache = new HashMap();
    }

    public Renderer(C4110c c4110c, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, ImagesCache imagesCache) {
        this(c4110c, new HashSet(), null, null, null, new BiMultiMap(), markerManager, polygonManager, polylineManager, groundOverlayManager);
        this.mContext = context;
        this.mStylesRenderer = new HashMap<>();
        this.mImagesCache = imagesCache == null ? new ImagesCache() : imagesCache;
    }

    protected void putStyles() {
        this.mStylesRenderer.putAll(this.mStyles);
    }

    protected void removeFeatures(HashMap<? extends Feature, Object> map) {
        removeFeatures(map.values());
    }

    private ArrayList<Object> addGeometryCollectionToMap(GeoJsonFeature geoJsonFeature, List<Geometry> list) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator<Geometry> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(addGeoJsonFeatureToMap(geoJsonFeature, it.next()));
        }
        return arrayList;
    }

    private ArrayList<Object> addMultiGeometryToMap(KmlPlacemark kmlPlacemark, KmlMultiGeometry kmlMultiGeometry, KmlStyle kmlStyle, KmlStyle kmlStyle2, boolean z10) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator<Geometry> it = kmlMultiGeometry.getGeometryObject().iterator();
        while (it.hasNext()) {
            KmlPlacemark kmlPlacemark2 = kmlPlacemark;
            arrayList.add(addKmlPlacemarkToMap(kmlPlacemark2, it.next(), kmlStyle, kmlStyle2, z10));
            kmlPlacemark = kmlPlacemark2;
        }
        return arrayList;
    }

    private ArrayList<C4472u> addMultiLineStringToMap(GeoJsonLineStringStyle geoJsonLineStringStyle, GeoJsonMultiLineString geoJsonMultiLineString) {
        ArrayList<C4472u> arrayList = new ArrayList<>();
        Iterator<GeoJsonLineString> it = geoJsonMultiLineString.getLineStrings().iterator();
        while (it.hasNext()) {
            arrayList.add(addLineStringToMap(geoJsonLineStringStyle.toPolylineOptions(), it.next()));
        }
        return arrayList;
    }

    private ArrayList<C4466n> addMultiPointToMap(GeoJsonPointStyle geoJsonPointStyle, GeoJsonMultiPoint geoJsonMultiPoint) {
        ArrayList<C4466n> arrayList = new ArrayList<>();
        Iterator<GeoJsonPoint> it = geoJsonMultiPoint.getPoints().iterator();
        while (it.hasNext()) {
            arrayList.add(addPointToMap(geoJsonPointStyle.toMarkerOptions(), it.next()));
        }
        return arrayList;
    }

    private ArrayList<C4470s> addMultiPolygonToMap(GeoJsonPolygonStyle geoJsonPolygonStyle, GeoJsonMultiPolygon geoJsonMultiPolygon) {
        ArrayList<C4470s> arrayList = new ArrayList<>();
        Iterator<GeoJsonPolygon> it = geoJsonMultiPolygon.getPolygons().iterator();
        while (it.hasNext()) {
            arrayList.add(addPolygonToMap(geoJsonPolygonStyle.toPolygonOptions(), it.next()));
        }
        return arrayList;
    }

    private void createInfoWindow() {
        this.mMarkers.setInfoWindowAdapter(new C4110c.b() { // from class: com.google.maps.android.data.Renderer.1
            @Override // Md.C4110c.b
            public View getInfoWindow(C4466n c4466n) {
                return null;
            }

            @Override // Md.C4110c.b
            public View getInfoContents(C4466n c4466n) {
                View viewInflate = LayoutInflater.from(Renderer.this.mContext).inflate(R.layout.amu_info_window, (ViewGroup) null);
                TextView textView = (TextView) viewInflate.findViewById(R.id.window);
                if (c4466n.c() == null) {
                    textView.setText(Html.fromHtml(c4466n.d()));
                    return viewInflate;
                }
                textView.setText(Html.fromHtml(c4466n.d() + "<br>" + c4466n.c()));
                return viewInflate;
            }
        });
    }

    protected static boolean getPlacemarkVisibility(Feature feature) {
        return (feature.hasProperty("visibility") && Integer.parseInt(feature.getProperty("visibility")) == 0) ? false : true;
    }

    private void putMarkerImagesCache(String str, String str2, C4455c c4455c) {
        Map<String, C4455c> map = this.mImagesCache.markerImagesCache.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.mImagesCache.markerImagesCache.put(str, map);
        }
        map.put(str2, c4455c);
    }

    private void removeFeatures(Collection collection) {
        for (Object obj : collection) {
            if (obj instanceof Collection) {
                removeFeatures((Collection) obj);
            } else if (obj instanceof C4466n) {
                this.mMarkers.remove((C4466n) obj);
            } else if (obj instanceof C4472u) {
                this.mPolylines.remove((C4472u) obj);
            } else if (obj instanceof C4470s) {
                this.mPolygons.remove((C4470s) obj);
            }
        }
    }

    private C4455c scaleIcon(Bitmap bitmap, double d10) {
        int i10;
        int i11 = (int) (this.mContext.getResources().getDisplayMetrics().density * 32.0f * d10);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < height) {
            i10 = (int) ((height * i11) / width);
        } else if (width > height) {
            int i12 = (int) ((width * i11) / height);
            i10 = i11;
            i11 = i12;
        } else {
            i10 = i11;
        }
        return C4456d.b(Bitmap.createScaledBitmap(bitmap, i11, i10, false));
    }

    private void setMarkerInfoWindow(KmlStyle kmlStyle, C4466n c4466n, KmlPlacemark kmlPlacemark) {
        boolean zHasProperty = kmlPlacemark.hasProperty("name");
        boolean zHasProperty2 = kmlPlacemark.hasProperty("description");
        boolean zHasBalloonStyle = kmlStyle.hasBalloonStyle();
        boolean zContainsKey = kmlStyle.getBalloonOptions().containsKey("text");
        if (zHasBalloonStyle && zContainsKey) {
            c4466n.r(KmlUtil.substituteProperties(kmlStyle.getBalloonOptions().get("text"), kmlPlacemark));
            createInfoWindow();
            return;
        }
        if (zHasBalloonStyle && zHasProperty) {
            c4466n.r(kmlPlacemark.getProperty("name"));
            createInfoWindow();
            return;
        }
        if (zHasProperty && zHasProperty2) {
            c4466n.r(kmlPlacemark.getProperty("name"));
            c4466n.p(kmlPlacemark.getProperty("description"));
            createInfoWindow();
        } else if (zHasProperty2) {
            c4466n.r(kmlPlacemark.getProperty("description"));
            createInfoWindow();
        } else if (zHasProperty) {
            c4466n.r(kmlPlacemark.getProperty("name"));
            createInfoWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void addFeature(com.google.maps.android.data.Feature r8) {
        /*
            r7 = this;
            java.lang.Object r0 = com.google.maps.android.data.Renderer.FEATURE_NOT_ON_MAP
            boolean r1 = r8 instanceof com.google.maps.android.data.geojson.GeoJsonFeature
            if (r1 == 0) goto Lc
            r1 = r8
            com.google.maps.android.data.geojson.GeoJsonFeature r1 = (com.google.maps.android.data.geojson.GeoJsonFeature) r1
            r7.setFeatureDefaultStyles(r1)
        Lc:
            boolean r1 = r7.mLayerOnMap
            if (r1 == 0) goto L52
            com.google.maps.android.data.geojson.BiMultiMap<com.google.maps.android.data.Feature> r1 = r7.mFeatures
            boolean r1 = r1.containsKey(r8)
            if (r1 == 0) goto L21
            com.google.maps.android.data.geojson.BiMultiMap<com.google.maps.android.data.Feature> r1 = r7.mFeatures
            java.lang.Object r1 = r1.get(r8)
            r7.removeFromMap(r1)
        L21:
            boolean r1 = r8.hasGeometry()
            if (r1 == 0) goto L52
            boolean r0 = r8 instanceof com.google.maps.android.data.kml.KmlPlacemark
            if (r0 == 0) goto L48
            boolean r6 = getPlacemarkVisibility(r8)
            java.lang.String r0 = r8.getId()
            com.google.maps.android.data.Geometry r3 = r8.getGeometry()
            com.google.maps.android.data.kml.KmlStyle r4 = r7.getPlacemarkStyle(r0)
            r2 = r8
            com.google.maps.android.data.kml.KmlPlacemark r2 = (com.google.maps.android.data.kml.KmlPlacemark) r2
            com.google.maps.android.data.kml.KmlStyle r5 = r2.getInlineStyle()
            r1 = r7
            java.lang.Object r0 = r1.addKmlPlacemarkToMap(r2, r3, r4, r5, r6)
            goto L53
        L48:
            r1 = r7
            com.google.maps.android.data.Geometry r0 = r8.getGeometry()
            java.lang.Object r0 = r7.addGeoJsonFeatureToMap(r8, r0)
            goto L53
        L52:
            r1 = r7
        L53:
            com.google.maps.android.data.geojson.BiMultiMap<com.google.maps.android.data.Feature> r2 = r1.mFeatures
            r2.put(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.data.Renderer.addFeature(com.google.maps.android.data.Feature):void");
    }

    protected C4462j attachGroundOverlay(C4463k c4463k) {
        return this.mGroundOverlays.addGroundOverlay(c4463k);
    }

    protected void cacheBitmap(String str, Bitmap bitmap) {
        this.mImagesCache.bitmapCache.put(str, bitmap);
    }

    protected void checkClearBitmapCache() {
        ImagesCache imagesCache;
        if (this.mNumActiveDownloads != 0 || (imagesCache = this.mImagesCache) == null || imagesCache.bitmapCache.isEmpty()) {
            return;
        }
        this.mImagesCache.bitmapCache.clear();
    }

    protected void clearStylesRenderer() {
        this.mStylesRenderer.clear();
    }

    protected void downloadFinished() {
        this.mNumActiveDownloads--;
        checkClearBitmapCache();
    }

    protected void downloadStarted() {
        this.mNumActiveDownloads++;
    }

    protected HashMap<? extends Feature, Object> getAllFeatures() {
        return this.mFeatures;
    }

    protected C4455c getCachedGroundOverlayImage(String str) {
        Bitmap bitmap;
        C4455c c4455c = this.mImagesCache.groundOverlayImagesCache.get(str);
        if (c4455c != null || (bitmap = this.mImagesCache.bitmapCache.get(str)) == null) {
            return c4455c;
        }
        C4455c c4455cB = C4456d.b(bitmap);
        this.mImagesCache.groundOverlayImagesCache.put(str, c4455cB);
        return c4455cB;
    }

    protected C4455c getCachedMarkerImage(String str, double d10) {
        Bitmap bitmap;
        String str2 = sScaleFormat.format(d10);
        Map<String, C4455c> map = this.mImagesCache.markerImagesCache.get(str);
        C4455c c4455c = map != null ? map.get(str2) : null;
        if (c4455c != null || (bitmap = this.mImagesCache.bitmapCache.get(str)) == null) {
            return c4455c;
        }
        C4455c c4455cScaleIcon = scaleIcon(bitmap, d10);
        putMarkerImagesCache(str, str2, c4455cScaleIcon);
        return c4455cScaleIcon;
    }

    Feature getContainerFeature(Object obj) {
        BiMultiMap<Feature> biMultiMap = this.mContainerFeatures;
        if (biMultiMap != null) {
            return biMultiMap.getKey(obj);
        }
        return null;
    }

    protected ArrayList<KmlContainer> getContainerList() {
        return this.mContainers;
    }

    GeoJsonLineStringStyle getDefaultLineStringStyle() {
        return this.mDefaultLineStringStyle;
    }

    GeoJsonPointStyle getDefaultPointStyle() {
        return this.mDefaultPointStyle;
    }

    GeoJsonPolygonStyle getDefaultPolygonStyle() {
        return this.mDefaultPolygonStyle;
    }

    Feature getFeature(Object obj) {
        return this.mFeatures.getKey(obj);
    }

    public Set<Feature> getFeatures() {
        return this.mFeatures.keySet();
    }

    public HashMap<KmlGroundOverlay, C4462j> getGroundOverlayMap() {
        return this.mGroundOverlayMap;
    }

    public C4110c getMap() {
        return this.mMap;
    }

    protected Set<String> getMarkerIconUrls() {
        return this.mMarkerIconUrls;
    }

    protected KmlStyle getPlacemarkStyle(String str) {
        return this.mStylesRenderer.get(str) != null ? this.mStylesRenderer.get(str) : this.mStylesRenderer.get(null);
    }

    protected HashMap<String, String> getStyleMaps() {
        return this.mStyleMaps;
    }

    protected HashMap<String, KmlStyle> getStylesRenderer() {
        return this.mStylesRenderer;
    }

    public Collection<Object> getValues() {
        return this.mFeatures.values();
    }

    protected boolean hasFeatures() {
        return this.mFeatures.size() > 0;
    }

    public boolean isLayerOnMap() {
        return this.mLayerOnMap;
    }

    protected void putContainerFeature(Object obj, Feature feature) {
        this.mContainerFeatures.put((BiMultiMap<Feature>) feature, obj);
    }

    protected void putFeatures(Feature feature, Object obj) {
        this.mFeatures.put((BiMultiMap<Feature>) feature, obj);
    }

    protected void putStyles(HashMap<String, KmlStyle> map) {
        this.mStylesRenderer.putAll(map);
    }

    protected void removeFeature(Feature feature) {
        if (this.mFeatures.containsKey(feature)) {
            removeFromMap(this.mFeatures.remove(feature));
        }
    }

    protected void removeFromMap(Object obj) {
        if (obj instanceof C4466n) {
            this.mMarkers.remove((C4466n) obj);
            return;
        }
        if (obj instanceof C4472u) {
            this.mPolylines.remove((C4472u) obj);
            return;
        }
        if (obj instanceof C4470s) {
            this.mPolygons.remove((C4470s) obj);
            return;
        }
        if (obj instanceof C4462j) {
            this.mGroundOverlays.remove((C4462j) obj);
        } else if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                removeFromMap(it.next());
            }
        }
    }

    protected void setLayerVisibility(boolean z10) {
        this.mLayerOnMap = z10;
    }

    public void setMap(C4110c c4110c) {
        this.mMap = c4110c;
    }

    void setOnFeatureClickListener(final Layer.OnFeatureClickListener onFeatureClickListener) {
        this.mPolygons.setOnPolygonClickListener(new C4110c.u() { // from class: com.google.maps.android.data.a
            @Override // Md.C4110c.u
            public final void onPolygonClick(C4470s c4470s) {
                this.f91169a.lambda$setOnFeatureClickListener$0(onFeatureClickListener, c4470s);
            }
        });
        this.mMarkers.setOnMarkerClickListener(new C4110c.p() { // from class: com.google.maps.android.data.b
            @Override // Md.C4110c.p
            public final boolean onMarkerClick(C4466n c4466n) {
                return this.f91171a.lambda$setOnFeatureClickListener$1(onFeatureClickListener, c4466n);
            }
        });
        this.mPolylines.setOnPolylineClickListener(new C4110c.v() { // from class: com.google.maps.android.data.c
            @Override // Md.C4110c.v
            public final void onPolylineClick(C4472u c4472u) {
                this.f91173a.lambda$setOnFeatureClickListener$2(onFeatureClickListener, c4472u);
            }
        });
    }

    protected void storeData(HashMap<String, KmlStyle> map, HashMap<String, String> map2, HashMap<KmlPlacemark, Object> map3, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, C4462j> map4) {
        this.mStyles = map;
        this.mStyleMaps = map2;
        this.mFeatures.putAll(map3);
        this.mContainers = arrayList;
        this.mGroundOverlayMap = map4;
    }

    private C4472u addLineStringToMap(C4473v c4473v, LineString lineString) {
        c4473v.B(lineString.getGeometryObject());
        C4472u c4472uAddPolyline = this.mPolylines.addPolyline(c4473v);
        c4472uAddPolyline.b(c4473v.L2());
        return c4472uAddPolyline;
    }

    private void addMarkerIcons(String str, double d10, C4467o c4467o) {
        C4455c cachedMarkerImage = getCachedMarkerImage(str, d10);
        if (cachedMarkerImage != null) {
            c4467o.L2(cachedMarkerImage);
        } else {
            this.mMarkerIconUrls.add(str);
        }
    }

    private C4466n addPointToMap(C4467o c4467o, Point point) {
        c4467o.U3(point.getGeometryObject());
        return this.mMarkers.addMarker(c4467o);
    }

    private C4470s addPolygonToMap(C4471t c4471t, DataPolygon dataPolygon) {
        c4471t.B(dataPolygon.getOuterBoundaryCoordinates());
        Iterator<List<LatLng>> it = dataPolygon.getInnerBoundaryCoordinates().iterator();
        while (it.hasNext()) {
            c4471t.T(it.next());
        }
        C4470s c4470sAddPolygon = this.mPolygons.addPolygon(c4471t);
        c4470sAddPolygon.b(c4471t.c2());
        return c4470sAddPolygon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFeatureClickListener$0(Layer.OnFeatureClickListener onFeatureClickListener, C4470s c4470s) {
        if (getFeature(c4470s) != null) {
            onFeatureClickListener.onFeatureClick(getFeature(c4470s));
        } else if (getContainerFeature(c4470s) != null) {
            onFeatureClickListener.onFeatureClick(getContainerFeature(c4470s));
        } else {
            onFeatureClickListener.onFeatureClick(getFeature(multiObjectHandler(c4470s)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setOnFeatureClickListener$1(Layer.OnFeatureClickListener onFeatureClickListener, C4466n c4466n) {
        if (getFeature(c4466n) != null) {
            onFeatureClickListener.onFeatureClick(getFeature(c4466n));
            return false;
        }
        if (getContainerFeature(c4466n) != null) {
            onFeatureClickListener.onFeatureClick(getContainerFeature(c4466n));
            return false;
        }
        onFeatureClickListener.onFeatureClick(getFeature(multiObjectHandler(c4466n)));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFeatureClickListener$2(Layer.OnFeatureClickListener onFeatureClickListener, C4472u c4472u) {
        if (getFeature(c4472u) != null) {
            onFeatureClickListener.onFeatureClick(getFeature(c4472u));
        } else if (getContainerFeature(c4472u) != null) {
            onFeatureClickListener.onFeatureClick(getContainerFeature(c4472u));
        } else {
            onFeatureClickListener.onFeatureClick(getFeature(multiObjectHandler(c4472u)));
        }
    }

    private ArrayList<?> multiObjectHandler(Object obj) {
        for (Object obj2 : getValues()) {
            if (obj2.getClass().getSimpleName().equals("ArrayList")) {
                ArrayList<?> arrayList = (ArrayList) obj2;
                if (arrayList.contains(obj)) {
                    return arrayList;
                }
            }
        }
        return null;
    }

    private void setFeatureDefaultStyles(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature.getPointStyle() == null) {
            geoJsonFeature.setPointStyle(this.mDefaultPointStyle);
        }
        if (geoJsonFeature.getLineStringStyle() == null) {
            geoJsonFeature.setLineStringStyle(this.mDefaultLineStringStyle);
        }
        if (geoJsonFeature.getPolygonStyle() == null) {
            geoJsonFeature.setPolygonStyle(this.mDefaultPolygonStyle);
        }
    }

    private void setInlineLineStringStyle(C4473v c4473v, KmlStyle kmlStyle) {
        C4473v polylineOptions = kmlStyle.getPolylineOptions();
        if (kmlStyle.isStyleSet("outlineColor")) {
            c4473v.I0(polylineOptions.h1());
        }
        if (kmlStyle.isStyleSet("width")) {
            c4473v.W3(polylineOptions.j2());
        }
        if (kmlStyle.isLineRandomColorMode()) {
            c4473v.I0(KmlStyle.computeRandomColor(polylineOptions.h1()));
        }
    }

    private void setInlinePointStyle(C4467o c4467o, KmlStyle kmlStyle, KmlStyle kmlStyle2) {
        double iconScale;
        C4467o markerOptions = kmlStyle.getMarkerOptions();
        if (kmlStyle.isStyleSet("heading")) {
            c4467o.V3(markerOptions.c2());
        }
        if (kmlStyle.isStyleSet("hotSpot")) {
            c4467o.T(markerOptions.d1(), markerOptions.h1());
        }
        if (kmlStyle.isStyleSet("markerColor")) {
            c4467o.L2(markerOptions.j1());
        }
        if (kmlStyle.isStyleSet("iconScale")) {
            iconScale = kmlStyle.getIconScale();
        } else if (kmlStyle2.isStyleSet("iconScale")) {
            iconScale = kmlStyle2.getIconScale();
        } else {
            iconScale = 1.0d;
        }
        if (kmlStyle.isStyleSet("iconUrl")) {
            addMarkerIcons(kmlStyle.getIconUrl(), iconScale, c4467o);
        } else if (kmlStyle2.getIconUrl() != null) {
            addMarkerIcons(kmlStyle2.getIconUrl(), iconScale, c4467o);
        }
    }

    private void setInlinePolygonStyle(C4471t c4471t, KmlStyle kmlStyle) {
        C4471t polygonOptions = kmlStyle.getPolygonOptions();
        if (kmlStyle.hasFill() && kmlStyle.isStyleSet("fillColor")) {
            c4471t.r0(polygonOptions.U0());
        }
        if (kmlStyle.hasOutline()) {
            if (kmlStyle.isStyleSet("outlineColor")) {
                c4471t.L2(polygonOptions.h1());
            }
            if (kmlStyle.isStyleSet("width")) {
                c4471t.W2(polygonOptions.P1());
            }
        }
        if (kmlStyle.isPolyRandomColorMode()) {
            c4471t.r0(KmlStyle.computeRandomColor(polygonOptions.U0()));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected Object addGeoJsonFeatureToMap(Feature feature, Geometry geometry) {
        String geometryType = geometry.getGeometryType();
        geometryType.getClass();
        char c10 = 65535;
        switch (geometryType.hashCode()) {
            case -2116761119:
                if (geometryType.equals("MultiPolygon")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1065891849:
                if (geometryType.equals("MultiPoint")) {
                    c10 = 1;
                    break;
                }
                break;
            case -627102946:
                if (geometryType.equals("MultiLineString")) {
                    c10 = 2;
                    break;
                }
                break;
            case 77292912:
                if (geometryType.equals("Point")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1267133722:
                if (geometryType.equals(KmlPolygon.GEOMETRY_TYPE)) {
                    c10 = 4;
                    break;
                }
                break;
            case 1806700869:
                if (geometryType.equals("LineString")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1950410960:
                if (geometryType.equals("GeometryCollection")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        C4467o markerOptions = null;
        C4473v polylineOptions = null;
        C4471t polygonOptions = null;
        switch (c10) {
            case 0:
                return addMultiPolygonToMap(((GeoJsonFeature) feature).getPolygonStyle(), (GeoJsonMultiPolygon) geometry);
            case 1:
                return addMultiPointToMap(((GeoJsonFeature) feature).getPointStyle(), (GeoJsonMultiPoint) geometry);
            case 2:
                return addMultiLineStringToMap(((GeoJsonFeature) feature).getLineStringStyle(), (GeoJsonMultiLineString) geometry);
            case 3:
                if (feature instanceof GeoJsonFeature) {
                    markerOptions = ((GeoJsonFeature) feature).getMarkerOptions();
                } else if (feature instanceof KmlPlacemark) {
                    markerOptions = ((KmlPlacemark) feature).getMarkerOptions();
                }
                return addPointToMap(markerOptions, (GeoJsonPoint) geometry);
            case 4:
                if (feature instanceof GeoJsonFeature) {
                    polygonOptions = ((GeoJsonFeature) feature).getPolygonOptions();
                } else if (feature instanceof KmlPlacemark) {
                    polygonOptions = ((KmlPlacemark) feature).getPolygonOptions();
                }
                return addPolygonToMap(polygonOptions, (DataPolygon) geometry);
            case 5:
                if (feature instanceof GeoJsonFeature) {
                    polylineOptions = ((GeoJsonFeature) feature).getPolylineOptions();
                } else if (feature instanceof KmlPlacemark) {
                    polylineOptions = ((KmlPlacemark) feature).getPolylineOptions();
                }
                return addLineStringToMap(polylineOptions, (GeoJsonLineString) geometry);
            case 6:
                return addGeometryCollectionToMap((GeoJsonFeature) feature, ((GeoJsonGeometryCollection) geometry).getGeometries());
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object addKmlPlacemarkToMap(com.google.maps.android.data.kml.KmlPlacemark r11, com.google.maps.android.data.Geometry r12, com.google.maps.android.data.kml.KmlStyle r13, com.google.maps.android.data.kml.KmlStyle r14, boolean r15) throws java.lang.NumberFormatException {
        /*
            r10 = this;
            java.lang.String r0 = r12.getGeometryType()
            java.lang.String r1 = "drawOrder"
            boolean r2 = r11.hasProperty(r1)
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L18
            java.lang.String r1 = r11.getProperty(r1)     // Catch: java.lang.NumberFormatException -> L17
            float r4 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L17
            goto L18
        L17:
            r2 = r3
        L18:
            r0.getClass()
            int r1 = r0.hashCode()
            r6 = -1
            switch(r1) {
                case 77292912: goto L46;
                case 89139371: goto L3b;
                case 1267133722: goto L30;
                case 1806700869: goto L25;
                default: goto L23;
            }
        L23:
            r3 = r6
            goto L4f
        L25:
            java.lang.String r1 = "LineString"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L23
        L2e:
            r3 = 3
            goto L4f
        L30:
            java.lang.String r1 = "Polygon"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L39
            goto L23
        L39:
            r3 = 2
            goto L4f
        L3b:
            java.lang.String r1 = "MultiGeometry"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L44
            goto L23
        L44:
            r3 = 1
            goto L4f
        L46:
            java.lang.String r1 = "Point"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            goto L23
        L4f:
            switch(r3) {
                case 0: goto Lb5;
                case 1: goto La8;
                case 2: goto L7e;
                case 3: goto L54;
                default: goto L52;
            }
        L52:
            r11 = 0
            return r11
        L54:
            Od.v r11 = r13.getPolylineOptions()
            if (r14 == 0) goto L5e
            r10.setInlineLineStringStyle(r11, r14)
            goto L6f
        L5e:
            boolean r13 = r13.isLineRandomColorMode()
            if (r13 == 0) goto L6f
            int r13 = r11.h1()
            int r13 = com.google.maps.android.data.kml.KmlStyle.computeRandomColor(r13)
            r11.I0(r13)
        L6f:
            com.google.maps.android.data.LineString r12 = (com.google.maps.android.data.LineString) r12
            Od.u r11 = r10.addLineStringToMap(r11, r12)
            r11.l(r15)
            if (r2 == 0) goto L7d
            r11.n(r4)
        L7d:
            return r11
        L7e:
            Od.t r11 = r13.getPolygonOptions()
            if (r14 == 0) goto L88
            r10.setInlinePolygonStyle(r11, r14)
            goto L99
        L88:
            boolean r13 = r13.isPolyRandomColorMode()
            if (r13 == 0) goto L99
            int r13 = r11.U0()
            int r13 = com.google.maps.android.data.kml.KmlStyle.computeRandomColor(r13)
            r11.r0(r13)
        L99:
            com.google.maps.android.data.DataPolygon r12 = (com.google.maps.android.data.DataPolygon) r12
            Od.s r11 = r10.addPolygonToMap(r11, r12)
            r11.l(r15)
            if (r2 == 0) goto La7
            r11.m(r4)
        La7:
            return r11
        La8:
            r2 = r12
            com.google.maps.android.data.kml.KmlMultiGeometry r2 = (com.google.maps.android.data.kml.KmlMultiGeometry) r2
            r0 = r10
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            java.util.ArrayList r11 = r0.addMultiGeometryToMap(r1, r2, r3, r4, r5)
            return r11
        Lb5:
            Od.o r7 = r13.getMarkerOptions()
            if (r14 == 0) goto Lbf
            r10.setInlinePointStyle(r7, r14, r13)
            goto Ld0
        Lbf:
            java.lang.String r14 = r13.getIconUrl()
            if (r14 == 0) goto Ld0
            java.lang.String r14 = r13.getIconUrl()
            double r8 = r13.getIconScale()
            r10.addMarkerIcons(r14, r8, r7)
        Ld0:
            com.google.maps.android.data.kml.KmlPoint r12 = (com.google.maps.android.data.kml.KmlPoint) r12
            Od.n r12 = r10.addPointToMap(r7, r12)
            r12.s(r15)
            r10.setMarkerInfoWindow(r13, r12, r11)
            if (r2 == 0) goto Le1
            r12.t(r4)
        Le1:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.data.Renderer.addKmlPlacemarkToMap(com.google.maps.android.data.kml.KmlPlacemark, com.google.maps.android.data.Geometry, com.google.maps.android.data.kml.KmlStyle, com.google.maps.android.data.kml.KmlStyle, boolean):java.lang.Object");
    }

    public void assignStyleMap(HashMap<String, String> map, HashMap<String, KmlStyle> map2) {
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (map2.containsKey(str2)) {
                map2.put(str, map2.get(str2));
            }
        }
    }

    protected void removeGroundOverlays(HashMap<KmlGroundOverlay, C4462j> map) {
        for (C4462j c4462j : map.values()) {
            if (c4462j != null) {
                this.mGroundOverlays.remove(c4462j);
            }
        }
    }

    public Renderer(C4110c c4110c, HashMap<? extends Feature, Object> map, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        this(c4110c, null, new GeoJsonPointStyle(), new GeoJsonLineStringStyle(), new GeoJsonPolygonStyle(), null, markerManager, polygonManager, polylineManager, groundOverlayManager);
        this.mFeatures.putAll(map);
        this.mImagesCache = null;
    }

    private Renderer(C4110c c4110c, Set<String> set, GeoJsonPointStyle geoJsonPointStyle, GeoJsonLineStringStyle geoJsonLineStringStyle, GeoJsonPolygonStyle geoJsonPolygonStyle, BiMultiMap<Feature> biMultiMap, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        this.mFeatures = new BiMultiMap<>();
        this.mNumActiveDownloads = 0;
        this.mMap = c4110c;
        this.mLayerOnMap = false;
        this.mMarkerIconUrls = set;
        this.mDefaultPointStyle = geoJsonPointStyle;
        this.mDefaultLineStringStyle = geoJsonLineStringStyle;
        this.mDefaultPolygonStyle = geoJsonPolygonStyle;
        this.mContainerFeatures = biMultiMap;
        if (c4110c != null) {
            this.mMarkers = (markerManager == null ? new MarkerManager(c4110c) : markerManager).newCollection();
            this.mPolygons = (polygonManager == null ? new PolygonManager(c4110c) : polygonManager).newCollection();
            this.mPolylines = (polylineManager == null ? new PolylineManager(c4110c) : polylineManager).newCollection();
            this.mGroundOverlays = (groundOverlayManager == null ? new GroundOverlayManager(c4110c) : groundOverlayManager).newCollection();
            return;
        }
        this.mMarkers = null;
        this.mPolygons = null;
        this.mPolylines = null;
        this.mGroundOverlays = null;
    }
}
