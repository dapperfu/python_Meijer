package de;

import android.util.Property;
import android.view.ViewGroup;

/* renamed from: de.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13664d extends Property<ViewGroup, Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final Property<ViewGroup, Float> f128356a = new C13664d("childrenAlpha");

    private C13664d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f10 = (Float) viewGroup.getTag(ce.f.f61678I);
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f10) {
        float fFloatValue = f10.floatValue();
        viewGroup.setTag(ce.f.f61678I, f10);
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup.getChildAt(i10).setAlpha(fFloatValue);
        }
    }
}
