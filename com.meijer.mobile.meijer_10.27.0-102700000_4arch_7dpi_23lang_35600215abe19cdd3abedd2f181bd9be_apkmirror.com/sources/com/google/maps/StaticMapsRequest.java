package com.google.maps;

import com.google.maps.ImageResult;
import com.google.maps.internal.ApiConfig;
import com.google.maps.internal.StringJoin;
import com.google.maps.model.EncodedPolyline;
import com.google.maps.model.LatLng;
import com.google.maps.model.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class StaticMapsRequest extends PendingResultBase<ImageResult, StaticMapsRequest, ImageResult.Response> {
    static final ApiConfig API_CONFIG = new ApiConfig("/maps/api/staticmap");

    public enum ImageFormat implements StringJoin.UrlValue {
        png("png"),
        png8("png8"),
        png32("png32"),
        gif("gif"),
        jpg("jpg"),
        jpgBaseline("jpg-baseline");

        private final String format;

        @Override // com.google.maps.internal.StringJoin.UrlValue
        public String toUrlValue() {
            return this.format;
        }

        ImageFormat(String str) {
            this.format = str;
        }
    }

    public static class Markers implements StringJoin.UrlValue {
        private static final Pattern labelPattern = Pattern.compile("^[A-Z0-9]$");
        private CustomIconAnchor anchorPoint;
        private String color;
        private String customIconURL;
        private String label;
        private final List<String> locations = new ArrayList();
        private Integer scale;
        private MarkersSize size;

        public void addLocation(String str) {
            this.locations.add(str);
        }

        public void customIcon(String str, CustomIconAnchor customIconAnchor) {
            this.customIconURL = str;
            this.anchorPoint = customIconAnchor;
        }

        public enum CustomIconAnchor implements StringJoin.UrlValue {
            top,
            bottom,
            left,
            right,
            center,
            topleft,
            topright,
            bottomleft,
            bottomright;

            @Override // com.google.maps.internal.StringJoin.UrlValue
            public String toUrlValue() {
                return name();
            }
        }

        public enum MarkersSize implements StringJoin.UrlValue {
            tiny,
            mid,
            small,
            normal;

            @Override // com.google.maps.internal.StringJoin.UrlValue
            public String toUrlValue() {
                return name();
            }
        }

        public void addLocation(LatLng latLng) {
            this.locations.add(latLng.toUrlValue());
        }

        public void color(String str) {
            this.color = str;
        }

        public void label(String str) {
            if (labelPattern.matcher(str).matches()) {
                this.label = str;
                return;
            }
            throw new IllegalArgumentException("Label '" + str + "' doesn't match acceptable label pattern.");
        }

        public void size(MarkersSize markersSize) {
            this.size = markersSize;
        }

        @Override // com.google.maps.internal.StringJoin.UrlValue
        public String toUrlValue() {
            ArrayList arrayList = new ArrayList();
            if (this.customIconURL != null) {
                arrayList.add("icon:" + this.customIconURL);
            }
            if (this.anchorPoint != null) {
                arrayList.add("anchor:" + this.anchorPoint.toUrlValue());
            }
            if (this.scale != null) {
                arrayList.add("scale:" + this.scale);
            }
            MarkersSize markersSize = this.size;
            if (markersSize != null && markersSize != MarkersSize.normal) {
                arrayList.add("size:" + this.size.toUrlValue());
            }
            if (this.color != null) {
                arrayList.add("color:" + this.color);
            }
            if (this.label != null) {
                arrayList.add("label:" + this.label);
            }
            arrayList.addAll(this.locations);
            return StringJoin.join('|', (String[]) arrayList.toArray(new String[arrayList.size()]));
        }

        public void customIcon(String str, CustomIconAnchor customIconAnchor, int i10) {
            this.customIconURL = str;
            this.anchorPoint = customIconAnchor;
            this.scale = Integer.valueOf(i10);
        }
    }

    public static class Path implements StringJoin.UrlValue {
        private String color;
        private String fillcolor;
        private boolean geodesic;
        private final List<String> points = new ArrayList();
        private int weight;

        public void addPoint(String str) {
            this.points.add(str);
        }

        public void addPoint(LatLng latLng) {
            this.points.add(latLng.toUrlValue());
        }

        public void color(String str) {
            this.color = str;
        }

        public void fillcolor(String str) {
            this.fillcolor = str;
        }

        public void geodesic(boolean z10) {
            this.geodesic = z10;
        }

        @Override // com.google.maps.internal.StringJoin.UrlValue
        public String toUrlValue() {
            ArrayList arrayList = new ArrayList();
            if (this.weight > 0) {
                arrayList.add("weight:" + this.weight);
            }
            if (this.color != null) {
                arrayList.add("color:" + this.color);
            }
            if (this.fillcolor != null) {
                arrayList.add("fillcolor:" + this.fillcolor);
            }
            if (this.geodesic) {
                arrayList.add("geodesic:" + this.geodesic);
            }
            arrayList.addAll(this.points);
            return StringJoin.join('|', (String[]) arrayList.toArray(new String[arrayList.size()]));
        }

        public void weight(int i10) {
            this.weight = i10;
        }
    }

    public StaticMapsRequest center(LatLng latLng) {
        return param("center", latLng);
    }

    public StaticMapsRequest path(Path path) {
        return paramAddToList("path", path);
    }

    public StaticMapsRequest visible(LatLng latLng) {
        return param("visible", latLng);
    }

    public enum StaticMapType implements StringJoin.UrlValue {
        roadmap,
        satellite,
        terrain,
        hybrid;

        @Override // com.google.maps.internal.StringJoin.UrlValue
        public String toUrlValue() {
            return name();
        }
    }

    public StaticMapsRequest(GeoApiContext geoApiContext) {
        super(geoApiContext, API_CONFIG, ImageResult.Response.class);
    }

    public StaticMapsRequest center(String str) {
        return param("center", str);
    }

    public StaticMapsRequest format(ImageFormat imageFormat) {
        return param("format", imageFormat);
    }

    public StaticMapsRequest maptype(StaticMapType staticMapType) {
        return param("maptype", staticMapType);
    }

    public StaticMapsRequest markers(Markers markers) {
        return paramAddToList("markers", markers);
    }

    public StaticMapsRequest path(EncodedPolyline encodedPolyline) {
        return paramAddToList("path", "enc:" + encodedPolyline.getEncodedPath());
    }

    public StaticMapsRequest region(String str) {
        return param("region", str);
    }

    public StaticMapsRequest scale(int i10) {
        return param("scale", i10);
    }

    public StaticMapsRequest size(Size size) {
        return param("size", size);
    }

    public StaticMapsRequest visible(String str) {
        return param("visible", str);
    }

    public StaticMapsRequest zoom(int i10) {
        return param("zoom", i10);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase channel(String str) {
        return super.channel(str);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase custom(String str, String str2) {
        return super.custom(str, str2);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase experienceIds(String[] strArr) {
        return super.experienceIds(strArr);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase header(String str, String str2) {
        return super.header(str, str2);
    }

    @Override // com.google.maps.PendingResultBase
    protected void validateRequest() {
        if ((!params().containsKey("center") || !params().containsKey("zoom")) && !params().containsKey("markers") && !params().containsKey("path")) {
            throw new IllegalArgumentException("Request must contain 'center' and 'zoom' if 'markers' or 'path' aren't present.");
        }
        if (params().containsKey("size")) {
        } else {
            throw new IllegalArgumentException("Request must contain 'size'.");
        }
    }
}
