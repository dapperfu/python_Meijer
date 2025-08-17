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
import g6.C;
import g6.C14202b;
import g6.C14205e;
import g6.C14209i;
import g6.D;
import g6.E;
import g6.EnumC14201a;
import g6.H;
import g6.I;
import g6.InterfaceC14200A;
import g6.InterfaceC14203c;
import g6.J;
import g6.K;
import g6.L;
import g6.M;
import g6.u;
import g6.y;
import j.C14791a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import v6.C17514c;

/* loaded from: classes4.dex */
public class LottieAnimationView extends AppCompatImageView implements FSLottieLottieAnimationView {

    /* renamed from: n, reason: collision with root package name */
    private static final String f62757n = "LottieAnimationView";

    /* renamed from: o, reason: collision with root package name */
    private static final InterfaceC14200A<Throwable> f62758o = new InterfaceC14200A() { // from class: g6.g
        @Override // g6.InterfaceC14200A
        public final void onResult(Object obj) {
            LottieAnimationView.b((Throwable) obj);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14200A<C14209i> f62759a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14200A<Throwable> f62760b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC14200A<Throwable> f62761c;

    /* renamed from: d, reason: collision with root package name */
    private int f62762d;

    /* renamed from: e, reason: collision with root package name */
    private final o f62763e;

    /* renamed from: f, reason: collision with root package name */
    private String f62764f;

    /* renamed from: g, reason: collision with root package name */
    private int f62765g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f62766h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f62767i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f62768j;

    /* renamed from: k, reason: collision with root package name */
    private final Set<b> f62769k;

    /* renamed from: l, reason: collision with root package name */
    private final Set<C> f62770l;

    /* renamed from: m, reason: collision with root package name */
    private q<C14209i> f62771m;

    private static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C1239a();

        /* renamed from: a, reason: collision with root package name */
        String f62772a;

        /* renamed from: b, reason: collision with root package name */
        int f62773b;

        /* renamed from: c, reason: collision with root package name */
        float f62774c;

        /* renamed from: d, reason: collision with root package name */
        boolean f62775d;

        /* renamed from: e, reason: collision with root package name */
        String f62776e;

        /* renamed from: f, reason: collision with root package name */
        int f62777f;

        /* renamed from: g, reason: collision with root package name */
        int f62778g;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$a$a, reason: collision with other inner class name */
        class C1239a implements Parcelable.Creator<a> {
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

            C1239a() {
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
            this.f62772a = parcel.readString();
            this.f62774c = parcel.readFloat();
            this.f62775d = parcel.readInt() == 1;
            this.f62776e = parcel.readString();
            this.f62777f = parcel.readInt();
            this.f62778g = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f62772a);
            parcel.writeFloat(this.f62774c);
            parcel.writeInt(this.f62775d ? 1 : 0);
            parcel.writeString(this.f62776e);
            parcel.writeInt(this.f62777f);
            parcel.writeInt(this.f62778g);
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

    private static class c implements InterfaceC14200A<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f62786a;

        public static void __fsTypeCheck_3df0e0c55f62e6e9fae5c6216719c006(LottieAnimationView lottieAnimationView, int i10) {
            if (lottieAnimationView instanceof ImageView) {
                FS.Resources_setImageResource(lottieAnimationView, i10);
            } else {
                lottieAnimationView.setImageResource(i10);
            }
        }

        @Override // g6.InterfaceC14200A
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th2) {
            LottieAnimationView lottieAnimationView = this.f62786a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.f62762d != 0) {
                __fsTypeCheck_3df0e0c55f62e6e9fae5c6216719c006(lottieAnimationView, lottieAnimationView.f62762d);
            }
            (lottieAnimationView.f62761c == null ? LottieAnimationView.f62758o : lottieAnimationView.f62761c).onResult(th2);
        }

        public c(LottieAnimationView lottieAnimationView) {
            this.f62786a = new WeakReference<>(lottieAnimationView);
        }
    }

    private static class d implements InterfaceC14200A<C14209i> {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f62787a;

        @Override // g6.InterfaceC14200A
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(C14209i c14209i) {
            LottieAnimationView lottieAnimationView = this.f62787a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(c14209i);
        }

        public d(LottieAnimationView lottieAnimationView) {
            this.f62787a = new WeakReference<>(lottieAnimationView);
        }
    }

    public void setAnimation(int i10) {
        this.f62765g = i10;
        this.f62764f = null;
        setCompositionTask(r(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        y(str, null);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f62765g = 0;
        this.f62764f = null;
        n();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f62765g = 0;
        this.f62764f = null;
        n();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        this.f62765g = 0;
        this.f62764f = null;
        n();
        super.setImageResource(i10);
    }

    public void setMaxFrame(int i10) {
        this.f62763e.C0(i10);
    }

    public void setMinFrame(int i10) {
        this.f62763e.H0(i10);
    }

    public void setProgress(float f10) {
        A(f10, true);
    }

    public void v() {
        this.f62767i = false;
        this.f62763e.i0();
    }

    private void A(float f10, boolean z10) {
        if (z10) {
            this.f62769k.add(b.SET_PROGRESS);
        }
        this.f62763e.M0(f10);
    }

    public static /* synthetic */ E a(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.f62768j ? u.p(lottieAnimationView.getContext(), str) : u.q(lottieAnimationView.getContext(), str, null);
    }

    public static /* synthetic */ E h(LottieAnimationView lottieAnimationView, int i10) {
        return lottieAnimationView.f62768j ? u.F(lottieAnimationView.getContext(), i10) : u.G(lottieAnimationView.getContext(), i10, null);
    }

    private void n() {
        q<C14209i> qVar = this.f62771m;
        if (qVar != null) {
            qVar.k(this.f62759a);
            this.f62771m.j(this.f62760b);
        }
    }

    private void o() {
        this.f62763e.t();
    }

    public EnumC14201a getAsyncUpdates() {
        return this.f62763e.E();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f62763e.F();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f62763e.H();
    }

    public boolean getClipToCompositionBounds() {
        return this.f62763e.I();
    }

    public int getFrame() {
        return this.f62763e.M();
    }

    public String getImageAssetsFolder() {
        return this.f62763e.O();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f62763e.Q();
    }

    public float getMaxFrame() {
        return this.f62763e.S();
    }

    public float getMinFrame() {
        return this.f62763e.T();
    }

    public H getPerformanceTracker() {
        return this.f62763e.U();
    }

    public float getProgress() {
        return this.f62763e.V();
    }

    public K getRenderMode() {
        return this.f62763e.W();
    }

    public int getRepeatCount() {
        return this.f62763e.X();
    }

    public int getRepeatMode() {
        return this.f62763e.Y();
    }

    public float getSpeed() {
        return this.f62763e.Z();
    }

    public <T> void m(n6.e eVar, T t10, C17514c<T> c17514c) {
        this.f62763e.q(eVar, t10, c17514c);
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
        this.f62764f = aVar.f62772a;
        Set<b> set = this.f62769k;
        b bVar = b.SET_ANIMATION;
        if (!set.contains(bVar) && !TextUtils.isEmpty(this.f62764f)) {
            setAnimation(this.f62764f);
        }
        this.f62765g = aVar.f62773b;
        if (!this.f62769k.contains(bVar) && (i10 = this.f62765g) != 0) {
            setAnimation(i10);
        }
        if (!this.f62769k.contains(b.SET_PROGRESS)) {
            A(aVar.f62774c, false);
        }
        if (!this.f62769k.contains(b.PLAY_OPTION) && aVar.f62775d) {
            w();
        }
        if (!this.f62769k.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(aVar.f62776e);
        }
        if (!this.f62769k.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(aVar.f62777f);
        }
        if (this.f62769k.contains(b.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(aVar.f62778g);
    }

    public void p(boolean z10) {
        this.f62763e.A(y.MergePathsApi19, z10);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f62768j ? u.H(getContext(), str) : u.I(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f62763e.o0(z10);
    }

    public void setApplyingShadowToLayersEnabled(boolean z10) {
        this.f62763e.p0(z10);
    }

    public void setAsyncUpdates(EnumC14201a enumC14201a) {
        this.f62763e.q0(enumC14201a);
    }

    public void setCacheComposition(boolean z10) {
        this.f62768j = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        this.f62763e.r0(z10);
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f62763e.s0(z10);
    }

    public void setComposition(C14209i c14209i) {
        if (C14205e.f132915a) {
            FS.log_v(f62757n, "Set Composition \n" + c14209i);
        }
        this.f62763e.setCallback(this);
        this.f62766h = true;
        boolean zT0 = this.f62763e.t0(c14209i);
        if (this.f62767i) {
            this.f62763e.j0();
        }
        this.f62766h = false;
        if (getDrawable() != this.f62763e || zT0) {
            if (!zT0) {
                z();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<C> it = this.f62770l.iterator();
            while (it.hasNext()) {
                it.next().a(c14209i);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f62763e.u0(str);
    }

    public void setFailureListener(InterfaceC14200A<Throwable> interfaceC14200A) {
        this.f62761c = interfaceC14200A;
    }

    public void setFallbackResource(int i10) {
        this.f62762d = i10;
    }

    public void setFontAssetDelegate(C14202b c14202b) {
        this.f62763e.v0(c14202b);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f62763e.w0(map);
    }

    public void setFrame(int i10) {
        this.f62763e.x0(i10);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f62763e.y0(z10);
    }

    public void setImageAssetDelegate(InterfaceC14203c interfaceC14203c) {
        this.f62763e.z0(interfaceC14203c);
    }

    public void setImageAssetsFolder(String str) {
        this.f62763e.A0(str);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f62763e.B0(z10);
    }

    public void setMaxFrame(String str) {
        this.f62763e.D0(str);
    }

    public void setMaxProgress(float f10) {
        this.f62763e.E0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f62763e.G0(str);
    }

    public void setMinFrame(String str) {
        this.f62763e.I0(str);
    }

    public void setMinProgress(float f10) {
        this.f62763e.J0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f62763e.K0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f62763e.L0(z10);
    }

    public void setRenderMode(K k10) {
        this.f62763e.N0(k10);
    }

    public void setRepeatCount(int i10) {
        this.f62769k.add(b.SET_REPEAT_COUNT);
        this.f62763e.O0(i10);
    }

    public void setRepeatMode(int i10) {
        this.f62769k.add(b.SET_REPEAT_MODE);
        this.f62763e.P0(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f62763e.Q0(z10);
    }

    public void setSpeed(float f10) {
        this.f62763e.R0(f10);
    }

    public void setTextDelegate(M m10) {
        this.f62763e.S0(m10);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f62763e.T0(z10);
    }

    public boolean u() {
        return this.f62763e.d0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        o oVar;
        if (!this.f62766h && drawable == (oVar = this.f62763e) && oVar.d0()) {
            v();
        } else if (!this.f62766h && (drawable instanceof o)) {
            o oVar2 = (o) drawable;
            if (oVar2.d0()) {
                oVar2.i0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void w() {
        this.f62769k.add(b.PLAY_OPTION);
        this.f62763e.j0();
    }

    public void y(String str, String str2) {
        x(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62759a = new d(this);
        this.f62760b = new c(this);
        this.f62762d = 0;
        this.f62763e = new o();
        this.f62766h = false;
        this.f62767i = false;
        this.f62768j = true;
        this.f62769k = new HashSet();
        this.f62770l = new HashSet();
        t(attributeSet, I.f132881a);
    }

    public static /* synthetic */ void b(Throwable th2) {
        if (u6.q.k(th2)) {
            u6.g.d("Unable to load composition.", th2);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th2);
    }

    private q<C14209i> q(final String str) {
        if (isInEditMode()) {
            return new q<>(new Callable() { // from class: g6.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.a(this.f132926a, str);
                }
            }, true);
        }
        if (this.f62768j) {
            return u.n(getContext(), str);
        }
        return u.o(getContext(), str, null);
    }

    private q<C14209i> r(final int i10) {
        if (isInEditMode()) {
            return new q<>(new Callable() { // from class: g6.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.h(this.f132928a, i10);
                }
            }, true);
        }
        if (this.f62768j) {
            return u.D(getContext(), i10);
        }
        return u.E(getContext(), i10, null);
    }

    private void setCompositionTask(q<C14209i> qVar) {
        E<C14209i> e10 = qVar.e();
        o oVar = this.f62763e;
        if (e10 != null && oVar == getDrawable() && oVar.J() == e10.b()) {
            return;
        }
        this.f62769k.add(b.SET_ANIMATION);
        o();
        n();
        this.f62771m = qVar.d(this.f62759a).c(this.f62760b);
    }

    private void t(AttributeSet attributeSet, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, J.f132882a, i10, 0);
        this.f62768j = typedArrayObtainStyledAttributes.getBoolean(J.f132887f, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(J.f132899r);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(J.f132894m);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(J.f132904w);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(J.f132899r, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(J.f132894m);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(J.f132904w)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(J.f132893l, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(J.f132886e, false)) {
            this.f62767i = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(J.f132897p, false)) {
            this.f62763e.O0(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f132902u)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(J.f132902u, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f132901t)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(J.f132901t, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f132903v)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(J.f132903v, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f132889h)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(J.f132889h, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f132888g)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(J.f132888g, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f132891j)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(J.f132891j));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(J.f132896o));
        A(typedArrayObtainStyledAttributes.getFloat(J.f132898q, 0.0f), typedArrayObtainStyledAttributes.hasValue(J.f132898q));
        p(typedArrayObtainStyledAttributes.getBoolean(J.f132892k, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(J.f132883b, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(J.f132884c, true));
        if (typedArrayObtainStyledAttributes.hasValue(J.f132890i)) {
            m(new n6.e("**"), D.f132841K, new C17514c(new L(C14791a.a(getContext(), typedArrayObtainStyledAttributes.getResourceId(J.f132890i, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f132900s)) {
            int i11 = J.f132900s;
            K k10 = K.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i11, k10.ordinal());
            if (iOrdinal >= K.values().length) {
                iOrdinal = k10.ordinal();
            }
            setRenderMode(K.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(J.f132885d)) {
            int i12 = J.f132885d;
            EnumC14201a enumC14201a = EnumC14201a.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i12, enumC14201a.ordinal());
            if (iOrdinal2 >= K.values().length) {
                iOrdinal2 = enumC14201a.ordinal();
            }
            setAsyncUpdates(EnumC14201a.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(J.f132895n, false));
        if (typedArrayObtainStyledAttributes.hasValue(J.f132905x)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(J.f132905x, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void z() {
        boolean zU = u();
        setImageDrawable(null);
        setImageDrawable(this.f62763e);
        if (zU) {
            this.f62763e.m0();
        }
    }

    public C14209i getComposition() {
        Drawable drawable = getDrawable();
        o oVar = this.f62763e;
        if (drawable == oVar) {
            return oVar.J();
        }
        return null;
    }

    public long getDuration() {
        C14209i composition = getComposition();
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
            this.f62763e.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        o oVar = this.f62763e;
        if (drawable2 == oVar) {
            super.invalidateDrawable(oVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean l(C c10) {
        C14209i composition = getComposition();
        if (composition != null) {
            c10.a(composition);
        }
        return this.f62770l.add(c10);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f62767i) {
            this.f62763e.j0();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f62772a = this.f62764f;
        aVar.f62773b = this.f62765g;
        aVar.f62774c = this.f62763e.V();
        aVar.f62775d = this.f62763e.e0();
        aVar.f62776e = this.f62763e.O();
        aVar.f62777f = this.f62763e.Y();
        aVar.f62778g = this.f62763e.X();
        return aVar;
    }

    public void x(InputStream inputStream, String str) {
        setCompositionTask(u.t(inputStream, str));
    }

    public void setAnimation(String str) {
        this.f62764f = str;
        this.f62765g = 0;
        setCompositionTask(q(str));
    }
}
