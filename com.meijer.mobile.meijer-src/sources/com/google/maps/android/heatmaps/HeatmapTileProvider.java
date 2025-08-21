package com.google.maps.android.heatmaps;

import Od.E;
import Od.H;
import Z.C;
import android.graphics.Bitmap;
import android.graphics.Color;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.quadtree.PointQuadTree;
import com.medallia.digital.mobilesdk.l3;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class HeatmapTileProvider implements H {
    public static final Gradient DEFAULT_GRADIENT;
    private static final int[] DEFAULT_GRADIENT_COLORS;
    private static final float[] DEFAULT_GRADIENT_START_POINTS;
    private static final int DEFAULT_MAX_ZOOM = 11;
    private static final int DEFAULT_MIN_ZOOM = 5;
    public static final double DEFAULT_OPACITY = 0.7d;
    public static final int DEFAULT_RADIUS = 20;
    private static final int MAX_RADIUS = 50;
    private static final int MAX_ZOOM_LEVEL = 22;
    private static final int MIN_RADIUS = 10;
    private static final int SCREEN_SIZE = 1280;
    private static final int TILE_DIM = 512;
    static final double WORLD_WIDTH = 1.0d;
    private Bounds mBounds;
    private int[] mColorMap;
    private double mCustomMaxIntensity;
    private Collection<WeightedLatLng> mData;
    private Gradient mGradient;
    private double[] mKernel;
    private double[] mMaxIntensity;
    private double mOpacity;
    private int mRadius;
    private PointQuadTree<WeightedLatLng> mTree;

    public static class Builder {
        private Collection<WeightedLatLng> data;
        private int radius = 20;
        private Gradient gradient = HeatmapTileProvider.DEFAULT_GRADIENT;
        private double opacity = 0.7d;
        private double intensity = 0.0d;

        public HeatmapTileProvider build() {
            if (this.data != null) {
                return new HeatmapTileProvider(this);
            }
            throw new IllegalStateException("No input data: you must use either .data or .weightedData before building");
        }

        public Builder gradient(Gradient gradient) {
            this.gradient = gradient;
            return this;
        }

        public Builder maxIntensity(double d10) {
            this.intensity = d10;
            return this;
        }

        public Builder opacity(double d10) {
            this.opacity = d10;
            if (d10 < 0.0d || d10 > 1.0d) {
                throw new IllegalArgumentException("Opacity must be in range [0, 1]");
            }
            return this;
        }

        public Builder radius(int i10) {
            this.radius = i10;
            if (i10 < 10 || i10 > HeatmapTileProvider.MAX_RADIUS) {
                throw new IllegalArgumentException("Radius not within bounds.");
            }
            return this;
        }

        public Builder weightedData(Collection<WeightedLatLng> collection) {
            this.data = collection;
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("No input points.");
            }
            return this;
        }

        public Builder data(Collection<LatLng> collection) {
            return weightedData(HeatmapTileProvider.wrapData(collection));
        }
    }

    static Bitmap colorize(double[][] dArr, int[] iArr, double d10) {
        int i10 = iArr[iArr.length - 1];
        double length = (iArr.length - 1) / d10;
        int length2 = dArr.length;
        int[] iArr2 = new int[length2 * length2];
        for (int i11 = 0; i11 < length2; i11++) {
            for (int i12 = 0; i12 < length2; i12++) {
                double d11 = dArr[i12][i11];
                int i13 = (i11 * length2) + i12;
                int i14 = (int) (d11 * length);
                if (d11 == 0.0d) {
                    iArr2[i13] = 0;
                } else if (i14 < iArr.length) {
                    iArr2[i13] = iArr[i14];
                } else {
                    iArr2[i13] = i10;
                }
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return bitmapCreateBitmap;
    }

    static {
        int[] iArr = {Color.rgb(102, 225, 0), Color.rgb(l3.f93323c, 0, 0)};
        DEFAULT_GRADIENT_COLORS = iArr;
        float[] fArr = {0.2f, 1.0f};
        DEFAULT_GRADIENT_START_POINTS = fArr;
        DEFAULT_GRADIENT = new Gradient(iArr, fArr);
    }

    private HeatmapTileProvider(Builder builder) {
        this.mData = builder.data;
        this.mRadius = builder.radius;
        this.mGradient = builder.gradient;
        this.mOpacity = builder.opacity;
        this.mCustomMaxIntensity = builder.intensity;
        int i10 = this.mRadius;
        this.mKernel = generateKernel(i10, i10 / 3.0d);
        setGradient(this.mGradient);
        setWeightedData(this.mData);
    }

    private static E convertBitmap(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new E(TILE_DIM, TILE_DIM, byteArrayOutputStream.toByteArray());
    }

    static double[][] convolve(double[][] dArr, double[] dArr2) {
        boolean z10;
        int i10;
        double d10;
        int iFloor = (int) Math.floor(dArr2.length / 2.0d);
        int length = dArr.length;
        int i11 = length - (iFloor * 2);
        int i12 = iFloor + i11;
        int i13 = i12 - 1;
        boolean z11 = true;
        int i14 = 0;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, length, length);
        int i15 = 0;
        while (true) {
            double d11 = 0.0d;
            if (i15 >= length) {
                break;
            }
            int i16 = i14;
            while (i16 < length) {
                double d12 = dArr[i15][i16];
                if (d12 != d11) {
                    z10 = z11;
                    int i17 = i15 + iFloor;
                    if (i13 < i17) {
                        i17 = i13;
                    }
                    int i18 = i17 + 1;
                    i10 = i14;
                    int i19 = i15 - iFloor;
                    d10 = d11;
                    for (int i20 = iFloor > i19 ? iFloor : i19; i20 < i18; i20++) {
                        double[] dArr4 = dArr3[i20];
                        dArr4[i16] = dArr4[i16] + (dArr2[i20 - i19] * d12);
                    }
                } else {
                    z10 = z11;
                    i10 = i14;
                    d10 = d11;
                }
                i16++;
                z11 = z10;
                i14 = i10;
                d11 = d10;
            }
            i15++;
        }
        int i21 = i14;
        int[] iArr = new int[2];
        iArr[z11 ? 1 : 0] = i11;
        iArr[i21] = i11;
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        for (int i22 = iFloor; i22 < i12; i22++) {
            for (int i23 = i21; i23 < length; i23++) {
                double d13 = dArr3[i22][i23];
                if (d13 != 0.0d) {
                    int i24 = i23 + iFloor;
                    if (i13 < i24) {
                        i24 = i13;
                    }
                    int i25 = i24 + 1;
                    int i26 = i23 - iFloor;
                    for (int i27 = iFloor > i26 ? iFloor : i26; i27 < i25; i27++) {
                        double[] dArr6 = dArr5[i22 - iFloor];
                        int i28 = i27 - iFloor;
                        dArr6[i28] = dArr6[i28] + (dArr2[i27 - i26] * d13);
                    }
                }
            }
        }
        return dArr5;
    }

    static double[] generateKernel(int i10, double d10) {
        double[] dArr = new double[(i10 * 2) + 1];
        for (int i11 = -i10; i11 <= i10; i11++) {
            dArr[i11 + i10] = Math.exp(((-i11) * i11) / ((2.0d * d10) * d10));
        }
        return dArr;
    }

    private double[] getMaxIntensities(int i10) {
        int i11;
        double[] dArr = new double[22];
        if (this.mCustomMaxIntensity != 0.0d) {
            for (int i12 = 0; i12 < 22; i12++) {
                dArr[i12] = this.mCustomMaxIntensity;
            }
        } else {
            int i13 = 5;
            while (true) {
                if (i13 >= 11) {
                    break;
                }
                dArr[i13] = getMaxValue(this.mData, this.mBounds, i10, (int) (Math.pow(2.0d, i13 - 3) * 1280.0d));
                if (i13 == 5) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        dArr[i14] = dArr[i13];
                    }
                }
                i13++;
            }
            for (i11 = 11; i11 < 22; i11++) {
                dArr[i11] = dArr[10];
            }
        }
        return dArr;
    }

    static double getMaxValue(Collection<WeightedLatLng> collection, Bounds bounds, int i10, int i11) {
        double d10 = bounds.minX;
        double d11 = bounds.maxX;
        double d12 = bounds.minY;
        double d13 = d11 - d10;
        double d14 = bounds.maxY - d12;
        if (d13 <= d14) {
            d13 = d14;
        }
        double d15 = ((int) ((i11 / (i10 * 2)) + 0.5d)) / d13;
        C c10 = new C();
        double d16 = 0.0d;
        for (WeightedLatLng weightedLatLng : collection) {
            double d17 = weightedLatLng.getPoint().f91175x;
            int i12 = (int) ((weightedLatLng.getPoint().f91176y - d12) * d15);
            long j10 = (int) ((d17 - d10) * d15);
            C c11 = (C) c10.d(j10);
            if (c11 == null) {
                c11 = new C();
                c10.i(j10, c11);
            }
            long j11 = i12;
            Double dValueOf = (Double) c11.d(j11);
            if (dValueOf == null) {
                dValueOf = Double.valueOf(0.0d);
            }
            double dDoubleValue = dValueOf.doubleValue() + weightedLatLng.getIntensity();
            c11.i(j11, Double.valueOf(dDoubleValue));
            if (dDoubleValue > d16) {
                d16 = dDoubleValue;
            }
        }
        return d16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection<WeightedLatLng> wrapData(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new WeightedLatLng(it.next()));
        }
        return arrayList;
    }

    @Override // Od.H
    public E getTile(int i10, int i11, int i12) {
        double d10 = 1.0d;
        double dPow = 1.0d / Math.pow(2.0d, i12);
        double d11 = (this.mRadius * dPow) / 512.0d;
        double d12 = ((2.0d * d11) + dPow) / ((r10 * 2) + TILE_DIM);
        double d13 = (i10 * dPow) - d11;
        double d14 = ((i10 + 1) * dPow) + d11;
        double d15 = (i11 * dPow) - d11;
        double d16 = ((i11 + 1) * dPow) + d11;
        Collection<WeightedLatLng> arrayList = new ArrayList();
        if (d13 < 0.0d) {
            arrayList = this.mTree.search(new Bounds(d13 + 1.0d, 1.0d, d15, d16));
            d10 = -1.0d;
        } else if (d14 > 1.0d) {
            arrayList = this.mTree.search(new Bounds(0.0d, d14 - 1.0d, d15, d16));
        } else {
            d10 = 0.0d;
        }
        Bounds bounds = new Bounds(d13, d14, d15, d16);
        Bounds bounds2 = this.mBounds;
        if (!bounds.intersects(new Bounds(bounds2.minX - d11, bounds2.maxX + d11, bounds2.minY - d11, bounds2.maxY + d11))) {
            return H.f23587a;
        }
        Collection<T> collectionSearch = this.mTree.search(bounds);
        if (collectionSearch.isEmpty()) {
            return H.f23587a;
        }
        int i13 = this.mRadius;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, (i13 * 2) + TILE_DIM, (i13 * 2) + TILE_DIM);
        for (T t10 : collectionSearch) {
            Point point = t10.getPoint();
            int i14 = (int) ((point.f91175x - d13) / d12);
            int i15 = (int) ((point.f91176y - d15) / d12);
            double[] dArr2 = dArr[i14];
            dArr2[i15] = dArr2[i15] + t10.getIntensity();
        }
        for (WeightedLatLng weightedLatLng : arrayList) {
            Point point2 = weightedLatLng.getPoint();
            int i16 = (int) (((point2.f91175x + d10) - d13) / d12);
            int i17 = (int) ((point2.f91176y - d15) / d12);
            double[] dArr3 = dArr[i16];
            dArr3[i17] = dArr3[i17] + weightedLatLng.getIntensity();
        }
        return convertBitmap(colorize(convolve(dArr, this.mKernel), this.mColorMap, this.mMaxIntensity[i12]));
    }

    public void setGradient(Gradient gradient) {
        this.mGradient = gradient;
        this.mColorMap = gradient.generateColorMap(this.mOpacity);
    }

    public void setMaxIntensity(double d10) {
        this.mCustomMaxIntensity = d10;
        setWeightedData(this.mData);
    }

    public void setOpacity(double d10) {
        this.mOpacity = d10;
        setGradient(this.mGradient);
    }

    public void setRadius(int i10) {
        this.mRadius = i10;
        this.mKernel = generateKernel(i10, i10 / 3.0d);
        this.mMaxIntensity = getMaxIntensities(this.mRadius);
    }

    public void setWeightedData(Collection<WeightedLatLng> collection) {
        this.mData = collection;
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("No input points.");
        }
        Bounds bounds = getBounds(this.mData);
        this.mBounds = bounds;
        this.mTree = new PointQuadTree<>(bounds);
        Iterator<WeightedLatLng> it = this.mData.iterator();
        while (it.hasNext()) {
            this.mTree.add(it.next());
        }
        this.mMaxIntensity = getMaxIntensities(this.mRadius);
    }

    static Bounds getBounds(Collection<WeightedLatLng> collection) {
        Iterator<WeightedLatLng> it = collection.iterator();
        WeightedLatLng next = it.next();
        double d10 = next.getPoint().f91175x;
        double d11 = next.getPoint().f91175x;
        double d12 = d10;
        double d13 = d11;
        double d14 = next.getPoint().f91176y;
        double d15 = next.getPoint().f91176y;
        while (it.hasNext()) {
            WeightedLatLng next2 = it.next();
            double d16 = next2.getPoint().f91175x;
            double d17 = next2.getPoint().f91176y;
            if (d16 < d12) {
                d12 = d16;
            }
            if (d16 > d13) {
                d13 = d16;
            }
            if (d17 < d14) {
                d14 = d17;
            }
            if (d17 > d15) {
                d15 = d17;
            }
        }
        return new Bounds(d12, d13, d14, d15);
    }

    public void setData(Collection<LatLng> collection) {
        setWeightedData(wrapData(collection));
    }
}
