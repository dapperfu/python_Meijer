package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import oe.C16118a;

/* loaded from: classes4.dex */
public interface c {

    public static class b implements TypeEvaluator<e> {

        /* renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<e> f87619b = new b();

        /* renamed from: a, reason: collision with root package name */
        private final e f87620a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f10, e eVar, e eVar2) {
            this.f87620a.a(C16118a.c(eVar.f87623a, eVar2.f87623a, f10), C16118a.c(eVar.f87624b, eVar2.f87624b, f10), C16118a.c(eVar.f87625c, eVar2.f87625c, f10));
            return this.f87620a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c, reason: collision with other inner class name */
    public static class C1276c extends Property<c, e> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<c, e> f87621a = new C1276c("circularReveal");

        private C1276c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(c cVar) {
            return cVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c cVar, e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    public static class d extends Property<c, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<c, Integer> f87622a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public float f87623a;

        /* renamed from: b, reason: collision with root package name */
        public float f87624b;

        /* renamed from: c, reason: collision with root package name */
        public float f87625c;

        private e() {
        }

        public void a(float f10, float f11, float f12) {
            this.f87623a = f10;
            this.f87624b = f11;
            this.f87625c = f12;
        }

        public e(float f10, float f11, float f12) {
            this.f87623a = f10;
            this.f87624b = f11;
            this.f87625c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
