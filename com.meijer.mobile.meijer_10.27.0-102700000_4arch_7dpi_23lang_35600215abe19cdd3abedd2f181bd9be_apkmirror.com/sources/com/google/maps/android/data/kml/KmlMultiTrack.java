package com.google.maps.android.data.kml;

import com.google.maps.android.data.Geometry;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class KmlMultiTrack extends KmlMultiGeometry {
    private static ArrayList<Geometry> createGeometries(ArrayList<KmlTrack> arrayList) {
        ArrayList<Geometry> arrayList2 = new ArrayList<>();
        if (arrayList == null) {
            throw new IllegalArgumentException("Tracks cannot be null");
        }
        Iterator<KmlTrack> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next());
        }
        return arrayList2;
    }

    public KmlMultiTrack(ArrayList<KmlTrack> arrayList) {
        super(createGeometries(arrayList));
    }
}
