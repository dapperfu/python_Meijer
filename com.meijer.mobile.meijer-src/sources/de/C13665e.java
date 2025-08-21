package de;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: de.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13665e extends Property<Drawable, Integer> {

    /* renamed from: b, reason: collision with root package name */
    public static final Property<Drawable, Integer> f128357b = new C13665e();

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Drawable, Integer> f128358a;

    private C13665e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f128358a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
