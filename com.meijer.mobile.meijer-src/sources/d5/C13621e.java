package d5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import com.google.android.gms.common.api.a;
import d5.InterfaceC13626j;
import d5.q;
import gw.AbstractC14426o;
import gw.C14416e;
import gw.InterfaceC14418g;
import gw.K;
import gw.w;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import m5.C15673l;
import n5.C15905b;
import n5.Size;
import r5.C16837a;
import r5.C16846j;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0003\u0013\u0019\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Ld5/e;", "Ld5/j;", "Ld5/q;", "source", "Lm5/l;", "options", "Lwv/h;", "parallelismLock", "Ld5/m;", "exifOrientationPolicy", "<init>", "(Ld5/q;Lm5/l;Lwv/h;Ld5/m;)V", "Landroid/graphics/BitmapFactory$Options;", "Ld5/h;", "e", "(Landroid/graphics/BitmapFactory$Options;)Ld5/h;", "Ld5/k;", "exifData", "", "c", "(Landroid/graphics/BitmapFactory$Options;Ld5/k;)V", "d", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ld5/q;", "b", "Lm5/l;", "Lwv/h;", "Ld5/m;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: d5.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13621e implements InterfaceC13626j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15673l options;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wv.h parallelismLock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m exifOrientationPolicy;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR4\u0010\u0012\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Ld5/e$b;", "Lgw/o;", "Lgw/K;", "delegate", "<init>", "(Lgw/K;)V", "Lgw/e;", "sink", "", "byteCount", "read", "(Lgw/e;J)J", "Ljava/lang/Exception;", "Lkotlin/Exception;", "value", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "exception", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: d5.e$b */
    private static final class b extends AbstractC14426o {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Exception exception;

        /* renamed from: a, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        public b(K k10) {
            super(k10);
        }

        @Override // gw.AbstractC14426o, gw.K
        public long read(C14416e sink, long byteCount) throws Exception {
            try {
                return super.read(sink, byteCount);
            } catch (Exception e10) {
                this.exception = e10;
                throw e10;
            }
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ld5/e$c;", "Ld5/j$a;", "", "maxParallelism", "Ld5/m;", "exifOrientationPolicy", "<init>", "(ILd5/m;)V", "Lg5/m;", "result", "Lm5/l;", "options", "La5/h;", "imageLoader", "Ld5/j;", "a", "(Lg5/m;Lm5/l;La5/h;)Ld5/j;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ld5/m;", "Lwv/h;", "b", "Lwv/h;", "parallelismLock", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: d5.e$c */
    public static final class c implements InterfaceC13626j.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final m exifOrientationPolicy;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final wv.h parallelismLock;

        @Override // d5.InterfaceC13626j.a
        public InterfaceC13626j a(g5.m result, C15673l options, a5.h imageLoader) {
            return new C13621e(result.getSource(), options, this.parallelismLock, this.exifOrientationPolicy);
        }

        public boolean equals(Object other) {
            return other instanceof c;
        }

        public int hashCode() {
            return c.class.hashCode();
        }

        public c(int i10, m mVar) {
            this.exifOrientationPolicy = mVar;
            this.parallelismLock = wv.l.b(i10, 0, 2, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {231, 46}, m = "decode")
    /* renamed from: d5.e$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f128039a;

        /* renamed from: b, reason: collision with root package name */
        Object f128040b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f128041c;

        /* renamed from: e, reason: collision with root package name */
        int f128043e;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f128041c = obj;
            this.f128043e |= Integer.MIN_VALUE;
            return C13621e.this.a(this);
        }
    }

    private final void c(BitmapFactory.Options options, C13627k c13627k) {
        Bitmap.Config config = this.options.getConfig();
        if (c13627k.getIsFlipped() || o.a(c13627k)) {
            config = C16837a.e(config);
        }
        if (this.options.getAllowRgb565() && config == Bitmap.Config.ARGB_8888 && Intrinsics.e(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && config != Bitmap.Config.HARDWARE) {
            config = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = config;
    }

    private final void d(BitmapFactory.Options options, C13627k c13627k) {
        q.a metadata = this.source.getMetadata();
        if ((metadata instanceof u) && C15905b.a(this.options.getSize())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((u) metadata).getDensity();
            options.inTargetDensity = this.options.getContext().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i10 = o.b(c13627k) ? options.outHeight : options.outWidth;
        int i11 = o.b(c13627k) ? options.outWidth : options.outHeight;
        Size size = this.options.getSize();
        int iB = C15905b.a(size) ? i10 : C16846j.B(size.getWidth(), this.options.getScale());
        Size size2 = this.options.getSize();
        int iB2 = C15905b.a(size2) ? i11 : C16846j.B(size2.getHeight(), this.options.getScale());
        int iA = C13625i.a(i10, i11, iB, iB2, this.options.getScale());
        options.inSampleSize = iA;
        double dB = C13625i.b(i10 / iA, i11 / iA, iB, iB2, this.options.getScale());
        if (this.options.getAllowInexactSize()) {
            dB = RangesKt.i(dB, 1.0d);
        }
        boolean z10 = dB == 1.0d;
        options.inScaled = !z10;
        if (z10) {
            return;
        }
        if (dB > 1.0d) {
            options.inDensity = MathKt.c(a.e.API_PRIORITY_OTHER / dB);
            options.inTargetDensity = a.e.API_PRIORITY_OTHER;
        } else {
            options.inDensity = a.e.API_PRIORITY_OTHER;
            options.inTargetDensity = MathKt.c(a.e.API_PRIORITY_OTHER * dB);
        }
    }

    private final C13624h e(BitmapFactory.Options options) throws Exception {
        b bVar = new b(this.source.b());
        InterfaceC14418g interfaceC14418gC = w.c(bVar);
        boolean z10 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(interfaceC14418gC.peek().T3(), null, options);
        Exception exception = bVar.getException();
        if (exception != null) {
            throw exception;
        }
        options.inJustDecodeBounds = false;
        n nVar = n.f128065a;
        C13627k c13627kA = nVar.a(options.outMimeType, interfaceC14418gC, this.exifOrientationPolicy);
        Exception exception2 = bVar.getException();
        if (exception2 != null) {
            throw exception2;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && this.options.getColorSpace() != null) {
            options.inPreferredColorSpace = this.options.getColorSpace();
        }
        options.inPremultiplied = this.options.getPremultipliedAlpha();
        c(options, c13627kA);
        d(options, c13627kA);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(interfaceC14418gC.T3(), null, options);
            CloseableKt.a(interfaceC14418gC, null);
            Exception exception3 = bVar.getException();
            if (exception3 != null) {
                throw exception3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.options.getContext().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.options.getContext().getResources(), nVar.b(bitmapDecodeStream, c13627kA));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z10 = false;
            }
            return new C13624h(bitmapDrawable, z10);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C13624h f(C13621e c13621e) {
        return c13621e.e(new BitmapFactory.Options());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // d5.InterfaceC13626j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation<? super d5.C13624h> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof d5.C13621e.d
            if (r0 == 0) goto L13
            r0 = r8
            d5.e$d r0 = (d5.C13621e.d) r0
            int r1 = r0.f128043e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128043e = r1
            goto L18
        L13:
            d5.e$d r0 = new d5.e$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f128041c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f128043e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.f128039a
            wv.h r0 = (wv.h) r0
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L70
        L30:
            r8 = move-exception
            goto L7a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.f128040b
            wv.h r2 = (wv.h) r2
            java.lang.Object r5 = r0.f128039a
            d5.e r5 = (d5.C13621e) r5
            kotlin.ResultKt.b(r8)
            r8 = r2
            goto L5a
        L47:
            kotlin.ResultKt.b(r8)
            wv.h r8 = r7.parallelismLock
            r0.f128039a = r7
            r0.f128040b = r8
            r0.f128043e = r4
            java.lang.Object r2 = r8.d(r0)
            if (r2 != r1) goto L59
            goto L6c
        L59:
            r5 = r7
        L5a:
            d5.d r2 = new d5.d     // Catch: java.lang.Throwable -> L76
            r2.<init>()     // Catch: java.lang.Throwable -> L76
            r0.f128039a = r8     // Catch: java.lang.Throwable -> L76
            r5 = 0
            r0.f128040b = r5     // Catch: java.lang.Throwable -> L76
            r0.f128043e = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = mv.C15840z0.c(r5, r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L76
            if (r0 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r6 = r0
            r0 = r8
            r8 = r6
        L70:
            d5.h r8 = (d5.C13624h) r8     // Catch: java.lang.Throwable -> L30
            r0.release()
            return r8
        L76:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L7a:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.C13621e.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public C13621e(q qVar, C15673l c15673l, wv.h hVar, m mVar) {
        this.source = qVar;
        this.options = c15673l;
        this.parallelismLock = hVar;
        this.exifOrientationPolicy = mVar;
    }
}
