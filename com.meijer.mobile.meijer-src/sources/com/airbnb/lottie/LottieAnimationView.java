package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.fullstory.FS;
import com.fullstory.instrumentation.frameworks.lottie.FSLottieLottieAnimationView;
import h6.C;
import h6.C14471b;
import h6.C14474e;
import h6.C14478i;
import h6.D;
import h6.E;
import h6.EnumC14470a;
import h6.H;
import h6.I;
import h6.InterfaceC14469A;
import h6.InterfaceC14472c;
import h6.J;
import h6.K;
import h6.L;
import h6.M;
import h6.u;
import h6.y;
import j.C14879a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import w6.C17847c;

/* loaded from: classes4.dex */
public class LottieAnimationView extends AppCompatImageView implements FSLottieLottieAnimationView {

    /* renamed from: n, reason: collision with root package name */
    private static final String f63596n = "LottieAnimationView";

    /* renamed from: o, reason: collision with root package name */
    private static final InterfaceC14469A<Throwable> f63597o = new InterfaceC14469A() { // from class: h6.g
        @Override // h6.InterfaceC14469A
        public final void onResult(Object obj) {
            LottieAnimationView.b((Throwable) obj);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14469A<C14478i> f63598a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14469A<Throwable> f63599b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC14469A<Throwable> f63600c;

    /* renamed from: d, reason: collision with root package name */
    private int f63601d;

    /* renamed from: e, reason: collision with root package name */
    private final o f63602e;

    /* renamed from: f, reason: collision with root package name */
    private String f63603f;

    /* renamed from: g, reason: collision with root package name */
    private int f63604g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f63605h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f63606i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f63607j;

    /* renamed from: k, reason: collision with root package name */
    private final Set<b> f63608k;

    /* renamed from: l, reason: collision with root package name */
    private final Set<C> f63609l;

    /* renamed from: m, reason: collision with root package name */
    private q<C14478i> f63610m;

    private static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C1249a();

        /* renamed from: a, reason: collision with root package name */
        String f63611a;

        /* renamed from: b, reason: collision with root package name */
        int f63612b;

        /* renamed from: c, reason: collision with root package name */
        float f63613c;

        /* renamed from: d, reason: collision with root package name */
        boolean f63614d;

        /* renamed from: e, reason: collision with root package name */
        String f63615e;

        /* renamed from: f, reason: collision with root package name */
        int f63616f;

        /* renamed from: g, reason: collision with root package name */
        int f63617g;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$a$a, reason: collision with other inner class name */
        class C1249a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }

            C1249a() {
            }
        }

        /* synthetic */ a(Parcel parcel, com.airbnb.lottie.a aVar) {
            this(parcel);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        private a(Parcel parcel) {
            super(parcel);
            this.f63611a = parcel.readString();
            this.f63613c = parcel.readFloat();
            this.f63614d = parcel.readInt() == 1;
            this.f63615e = parcel.readString();
            this.f63616f = parcel.readInt();
            this.f63617g = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f63611a);
            parcel.writeFloat(this.f63613c);
            parcel.writeInt(this.f63614d ? 1 : 0);
            parcel.writeString(this.f63615e);
            parcel.writeInt(this.f63616f);
            parcel.writeInt(this.f63617g);
        }
    }

    private enum b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    private static class c implements InterfaceC14469A<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f63625a;

        public static void __fsTypeCheck_3df0e0c55f62e6e9fae5c6216719c006(LottieAnimationView lottieAnimationView, int i10) {
            if (lottieAnimationView instanceof ImageView) {
                FS.Resources_setImageResource(lottieAnimationView, i10);
            } else {
                lottieAnimationView.setImageResource(i10);
            }
        }

        @Override // h6.InterfaceC14469A
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th2) {
            LottieAnimationView lottieAnimationView = this.f63625a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.f63601d != 0) {
                __fsTypeCheck_3df0e0c55f62e6e9fae5c6216719c006(lottieAnimationView, lottieAnimationView.f63601d);
            }
            (lottieAnimationView.f63600c == null ? LottieAnimationView.f63597o : lottieAnimationView.f63600c).onResult(th2);
        }

        public c(LottieAnimationView lottieAnimationView) {
            this.f63625a = new WeakReference<>(lottieAnimationView);
        }
    }

    private static class d implements InterfaceC14469A<C14478i> {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f63626a;

        @Override // h6.InterfaceC14469A
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(C14478i c14478i) {
            LottieAnimationView lottieAnimationView = this.f63626a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(c14478i);
        }

        public d(LottieAnimationView lottieAnimationView) {
            this.f63626a = new WeakReference<>(lottieAnimationView);
        }
    }

    public void setAnimation(int i10) {
        this.f63604g = i10;
        this.f63603f = null;
        setCompositionTask(r(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        y(str, null);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f63604g = 0;
        this.f63603f = null;
        n();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f63604g = 0;
        this.f63603f = null;
        n();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        this.f63604g = 0;
        this.f63603f = null;
        n();
        super.setImageResource(i10);
    }

    public void setMaxFrame(int i10) {
        this.f63602e.C0(i10);
    }

    public void setMinFrame(int i10) {
        this.f63602e.H0(i10);
    }

    public void setProgress(float f10) {
        A(f10, true);
    }

    public void v() {
        this.f63606i = false;
        this.f63602e.i0();
    }

    private void A(float f10, boolean z10) {
        if (z10) {
            this.f63608k.add(b.SET_PROGRESS);
        }
        this.f63602e.M0(f10);
    }

    public static /* synthetic */ E a(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.f63607j ? u.p(lottieAnimationView.getContext(), str) : u.q(lottieAnimationView.getContext(), str, null);
    }

    public static /* synthetic */ E h(LottieAnimationView lottieAnimationView, int i10) {
        return lottieAnimationView.f63607j ? u.F(lottieAnimationView.getContext(), i10) : u.G(lottieAnimationView.getContext(), i10, null);
    }

    private void n() {
        q<C14478i> qVar = this.f63610m;
        if (qVar != null) {
            qVar.k(this.f63598a);
            this.f63610m.j(this.f63599b);
        }
    }

    private void o() {
        this.f63602e.t();
    }

    public EnumC14470a getAsyncUpdates() {
        return this.f63602e.E();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f63602e.F();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f63602e.H();
    }

    public boolean getClipToCompositionBounds() {
        return this.f63602e.I();
    }

    public int getFrame() {
        return this.f63602e.M();
    }

    public String getImageAssetsFolder() {
        return this.f63602e.O();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f63602e.Q();
    }

    public float getMaxFrame() {
        return this.f63602e.S();
    }

    public float getMinFrame() {
        return this.f63602e.T();
    }

    public H getPerformanceTracker() {
        return this.f63602e.U();
    }

    public float getProgress() {
        return this.f63602e.V();
    }

    public K getRenderMode() {
        return this.f63602e.W();
    }

    public int getRepeatCount() {
        return this.f63602e.X();
    }

    public int getRepeatMode() {
        return this.f63602e.Y();
    }

    public float getSpeed() {
        return this.f63602e.Z();
    }

    public <T> void m(o6.e eVar, T t10, C17847c<T> c17847c) {
        this.f63602e.q(eVar, t10, c17847c);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        this.f63603f = aVar.f63611a;
        Set<b> set = this.f63608k;
        b bVar = b.SET_ANIMATION;
        if (!set.contains(bVar) && !TextUtils.isEmpty(this.f63603f)) {
            setAnimation(this.f63603f);
        }
        this.f63604g = aVar.f63612b;
        if (!this.f63608k.contains(bVar) && (i10 = this.f63604g) != 0) {
            setAnimation(i10);
        }
        if (!this.f63608k.contains(b.SET_PROGRESS)) {
            A(aVar.f63613c, false);
        }
        if (!this.f63608k.contains(b.PLAY_OPTION) && aVar.f63614d) {
            w();
        }
        if (!this.f63608k.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(aVar.f63615e);
        }
        if (!this.f63608k.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(aVar.f63616f);
        }
        if (this.f63608k.contains(b.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(aVar.f63617g);
    }

    public void p(boolean z10) {
        this.f63602e.A(y.MergePathsApi19, z10);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f63607j ? u.H(getContext(), str) : u.I(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f63602e.o0(z10);
    }

    public void setApplyingShadowToLayersEnabled(boolean z10) {
        this.f63602e.p0(z10);
    }

    public void setAsyncUpdates(EnumC14470a enumC14470a) {
        this.f63602e.q0(enumC14470a);
    }

    public void setCacheComposition(boolean z10) {
        this.f63607j = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        this.f63602e.r0(z10);
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f63602e.s0(z10);
    }

    public void setComposition(C14478i c14478i) {
        if (C14474e.f135091a) {
            FS.log_v(f63596n, "Set Composition \n" + c14478i);
        }
        this.f63602e.setCallback(this);
        this.f63605h = true;
        boolean zT0 = this.f63602e.t0(c14478i);
        if (this.f63606i) {
            this.f63602e.j0();
        }
        this.f63605h = false;
        if (getDrawable() != this.f63602e || zT0) {
            if (!zT0) {
                z();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<C> it = this.f63609l.iterator();
            while (it.hasNext()) {
                it.next().a(c14478i);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f63602e.u0(str);
    }

    public void setFailureListener(InterfaceC14469A<Throwable> interfaceC14469A) {
        this.f63600c = interfaceC14469A;
    }

    public void setFallbackResource(int i10) {
        this.f63601d = i10;
    }

    public void setFontAssetDelegate(C14471b c14471b) {
        this.f63602e.v0(c14471b);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f63602e.w0(map);
    }

    public void setFrame(int i10) {
        this.f63602e.x0(i10);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f63602e.y0(z10);
    }

    public void setImageAssetDelegate(InterfaceC14472c interfaceC14472c) {
        this.f63602e.z0(interfaceC14472c);
    }

    public void setImageAssetsFolder(String str) {
        this.f63602e.A0(str);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f63602e.B0(z10);
    }

    public void setMaxFrame(String str) {
        this.f63602e.D0(str);
    }

    public void setMaxProgress(float f10) {
        this.f63602e.E0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f63602e.G0(str);
    }

    public void setMinFrame(String str) {
        this.f63602e.I0(str);
    }

    public void setMinProgress(float f10) {
        this.f63602e.J0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f63602e.K0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f63602e.L0(z10);
    }

    public void setRenderMode(K k10) {
        this.f63602e.N0(k10);
    }

    public void setRepeatCount(int i10) {
        this.f63608k.add(b.SET_REPEAT_COUNT);
        this.f63602e.O0(i10);
    }

    public void setRepeatMode(int i10) {
        this.f63608k.add(b.SET_REPEAT_MODE);
        this.f63602e.P0(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f63602e.Q0(z10);
    }

    public void setSpeed(float f10) {
        this.f63602e.R0(f10);
    }

    public void setTextDelegate(M m10) {
        this.f63602e.S0(m10);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f63602e.T0(z10);
    }

    public boolean u() {
        return this.f63602e.d0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        o oVar;
        if (!this.f63605h && drawable == (oVar = this.f63602e) && oVar.d0()) {
            v();
        } else if (!this.f63605h && (drawable instanceof o)) {
            o oVar2 = (o) drawable;
            if (oVar2.d0()) {
                oVar2.i0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void w() {
        this.f63608k.add(b.PLAY_OPTION);
        this.f63602e.j0();
    }

    public void y(String str, String str2) {
        x(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63598a = new d(this);
        this.f63599b = new c(this);
        this.f63601d = 0;
        this.f63602e = new o();
        this.f63605h = false;
        this.f63606i = false;
        this.f63607j = true;
        this.f63608k = new HashSet();
        this.f63609l = new HashSet();
        t(attributeSet, I.f135057a);
    }

    public static /* synthetic */ void b(Throwable th2) {
        if (v6.q.k(th2)) {
            v6.g.d("Unable to load composition.", th2);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th2);
    }

    private q<C14478i> q(final String str) {
        if (isInEditMode()) {
            return new q<>(new Callable() { // from class: h6.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.a(this.f135102a, str);
                }
            }, true);
        }
        if (this.f63607j) {
            return u.n(getContext(), str);
        }
        return u.o(getContext(), str, null);
    }

    private q<C14478i> r(final int i10) {
        if (isInEditMode()) {
            return new q<>(new Callable() { // from class: h6.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.h(this.f135104a, i10);
                }
            }, true);
        }
        if (this.f63607j) {
            return u.D(getContext(), i10);
        }
        return u.E(getContext(), i10, null);
    }

    private void setCompositionTask(q<C14478i> qVar) {
        E<C14478i> e10 = qVar.e();
        o oVar = this.f63602e;
        if (e10 != null && oVar == getDrawable() && oVar.J() == e10.b()) {
            return;
        }
        this.f63608k.add(b.SET_ANIMATION);
        o();
        n();
        this.f63610m = qVar.d(this.f63598a).c(this.f63599b);
    }

    private void t(AttributeSet attributeSet, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, J.f135058a, i10, 0);
        this.f63607j = typedArrayObtainStyledAttributes.getBoolean(J.f135063f, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(J.f135075r);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(J.f135070m);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(J.f135080w);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(J.f135075r, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(J.f135070m);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(J.f135080w)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(J.f135069l, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(J.f135062e, false)) {
            this.f63606i = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(J.f135073p, false)) {
            this.f63602e.O0(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f135078u)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(J.f135078u, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f135077t)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(J.f135077t, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f135079v)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(J.f135079v, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f135065h)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(J.f135065h, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f135064g)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(J.f135064g, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f135067j)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(J.f135067j));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(J.f135072o));
        A(typedArrayObtainStyledAttributes.getFloat(J.f135074q, 0.0f), typedArrayObtainStyledAttributes.hasValue(J.f135074q));
        p(typedArrayObtainStyledAttributes.getBoolean(J.f135068k, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(J.f135059b, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(J.f135060c, true));
        if (typedArrayObtainStyledAttributes.hasValue(J.f135066i)) {
            m(new o6.e("**"), D.f135017K, new C17847c(new L(C14879a.a(getContext(), typedArrayObtainStyledAttributes.getResourceId(J.f135066i, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f135076s)) {
            int i11 = J.f135076s;
            K k10 = K.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i11, k10.ordinal());
            if (iOrdinal >= K.values().length) {
                iOrdinal = k10.ordinal();
            }
            setRenderMode(K.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f135061d)) {
            int i12 = J.f135061d;
            EnumC14470a enumC14470a = EnumC14470a.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i12, enumC14470a.ordinal());
            if (iOrdinal2 >= K.values().length) {
                iOrdinal2 = enumC14470a.ordinal();
            }
            setAsyncUpdates(EnumC14470a.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(J.f135071n, false));
        if (typedArrayObtainStyledAttributes.hasValue(J.f135081x)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(J.f135081x, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void z() {
        boolean zU = u();
        setImageDrawable(null);
        setImageDrawable(this.f63602e);
        if (zU) {
            this.f63602e.m0();
        }
    }

    public C14478i getComposition() {
        Drawable drawable = getDrawable();
        o oVar = this.f63602e;
        if (drawable == oVar) {
            return oVar.J();
        }
        return null;
    }

    public long getDuration() {
        C14478i composition = getComposition();
        if (composition != null) {
            return (long) composition.d();
        }
        return 0L;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof o) && ((o) drawable).W() == K.SOFTWARE) {
            this.f63602e.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        o oVar = this.f63602e;
        if (drawable2 == oVar) {
            super.invalidateDrawable(oVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean l(C c10) {
        C14478i composition = getComposition();
        if (composition != null) {
            c10.a(composition);
        }
        return this.f63609l.add(c10);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f63606i) {
            this.f63602e.j0();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f63611a = this.f63603f;
        aVar.f63612b = this.f63604g;
        aVar.f63613c = this.f63602e.V();
        aVar.f63614d = this.f63602e.e0();
        aVar.f63615e = this.f63602e.O();
        aVar.f63616f = this.f63602e.Y();
        aVar.f63617g = this.f63602e.X();
        return aVar;
    }

    public void x(InputStream inputStream, String str) {
        setCompositionTask(u.t(inputStream, str));
    }

    public void setAnimation(String str) {
        this.f63603f = str;
        this.f63604g = 0;
        setCompositionTask(q(str));
    }
}
