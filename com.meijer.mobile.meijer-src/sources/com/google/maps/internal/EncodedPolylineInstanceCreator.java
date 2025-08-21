package com.google.maps.internal;

import com.google.gson.g;
import com.google.maps.model.EncodedPolyline;
import java.lang.reflect.Type;

/* loaded from: classes8.dex */
public class EncodedPolylineInstanceCreator implements g<EncodedPolyline> {
    private String points;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.g
    public EncodedPolyline createInstance(Type type) {
        return new EncodedPolyline(this.points);
    }

    public EncodedPolylineInstanceCreator(String str) {
        this.points = str;
    }
}
