package com.scandit.datacapture.core.internal.module.source.api2;

import android.util.Rational;
import android.util.Size;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13352z implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f125011a;

    public C13352z(float f10) {
        this.f125011a = f10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        return ComparisonsKt.d(Float.valueOf(Math.abs(this.f125011a - new Rational(size.getWidth(), size.getHeight()).floatValue())), Float.valueOf(Math.abs(this.f125011a - new Rational(size2.getWidth(), size2.getHeight()).floatValue())));
    }
}
