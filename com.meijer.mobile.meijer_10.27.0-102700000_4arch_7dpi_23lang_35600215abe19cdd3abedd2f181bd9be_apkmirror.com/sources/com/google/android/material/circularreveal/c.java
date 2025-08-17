package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import me.C15608a;

/* loaded from: classes4.dex */
public interface c {

    public static class b implements TypeEvaluator<e> {

        /* renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<e> f86779b = new b();

        /* renamed from: a, reason: collision with root package name */
        private final e f86780a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f10, e eVar, e eVar2) {
            this.f86780a.a(C15608a.c(eVar.f86783a, eVar2.f86783a, f10), C15608a.c(eVar.f86784b, eVar2.f86784b, f10), C15608a.c(eVar.f86785c, eVar2.f86785c, f10));
            return this.f86780a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c, reason: collision with other inner class name */
    public static class C1267c extends Property<c, e> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<c, e> f86781a = new C1267c("circularReveal");

        private C1267c(String str) {
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
        public static final Property<c, Integer> f86782a = new d("circularRevealScrimColor");

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
        public float f86783a;

        /* renamed from: b, reason: collision with root package name */
        public float f86784b;

        /* renamed from: c, reason: collision with root package name */
        public float f86785c;

        private e() {
        }

        public void a(float f10, float f11, float f12) {
            this.f86783a = f10;
            this.f86784b = f11;
            this.f86785c = f12;
        }

        public e(float f10, float f11, float f12) {
            this.f86783a = f10;
            this.f86784b = f11;
            this.f86785c = f12;
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
