package Mp;

import Td.AbstractC5232j;
import Td.InterfaceC5228f;
import Td.InterfaceC5229g;
import android.graphics.Bitmap;
import androidx.camera.core.f;
import androidx.camera.core.n;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ug.InterfaceC17254a;
import vg.C17567a;
import yg.C18212a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0012\u0010B<\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012)\b\u0001\u0010\u000b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R5\u0010\u000b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"LMp/d;", "Landroidx/camera/core/f$a;", "Lug/a;", "scanner", "Lkotlin/Function1;", "", "Lvg/a;", "Lkotlin/ParameterName;", "name", "barcodes", "", "onBarcodesScanned", "<init>", "(Lug/a;Lkotlin/jvm/functions/Function1;)V", "Landroidx/camera/core/n;", "imageProxy", "b", "(Landroidx/camera/core/n;)V", "a", "Lug/a;", "Lkotlin/jvm/functions/Function1;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class d implements f.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17254a scanner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<List<? extends C17567a>, Unit> onBarcodesScanned;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J8\u0010\u000b\u001a\u00020\n2'\u0010\t\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0002H&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"LMp/d$a;", "", "Lkotlin/Function1;", "", "Lvg/a;", "Lkotlin/ParameterName;", "name", "barcodes", "", "onBarcodesScanned", "LMp/d;", "a", "(Lkotlin/jvm/functions/Function1;)LMp/d;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        d a(Function1<? super List<? extends C17567a>, Unit> onBarcodesScanned);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"LMp/d$b;", "", "", "height", "width", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Mp.d$b, reason: from toString */
    public static final /* data */ class Size {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int height;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int width;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Size)) {
                return false;
            }
            Size size = (Size) other;
            return this.height == size.height && this.width == size.width;
        }

        /* renamed from: a, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* renamed from: b, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (Integer.hashCode(this.height) * 31) + Integer.hashCode(this.width);
        }

        public String toString() {
            return "Size(height=" + this.height + ", width=" + this.width + ')';
        }

        public Size(int i10, int i11) {
            this.height = i10;
            this.width = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(InterfaceC17254a scanner, Function1<? super List<? extends C17567a>, Unit> onBarcodesScanned) {
        Intrinsics.j(scanner, "scanner");
        Intrinsics.j(onBarcodesScanned, "onBarcodesScanned");
        this.scanner = scanner;
        this.onBarcodesScanned = onBarcodesScanned;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Exception it) {
        Intrinsics.j(it, "it");
        uw.a.INSTANCE.l(it, "BarcodeAnalyzer: Image analysis failed", new Object[0]);
    }

    @Override // androidx.camera.core.f.a
    public void b(n imageProxy) {
        Intrinsics.j(imageProxy, "imageProxy");
        try {
            Bitmap bitmapC3 = imageProxy.c3();
            int iC = imageProxy.S2().c();
            Size size = (iC == 90 || iC == 270) ? new Size(bitmapC3.getWidth() / 2, bitmapC3.getHeight() / 2) : new Size(bitmapC3.getHeight() / 2, bitmapC3.getWidth() / 2);
            int i10 = ((float) size.getHeight()) + 200.0f <= ((float) (size.getHeight() * 2)) ? HttpResponseStatus.SUCCESS_OK : 0;
            int i11 = ((float) size.getWidth()) + 300.0f <= ((float) (size.getWidth() * 2)) ? HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES : 0;
            int iMax = 1;
            int iMax2 = i10 == 0 ? 1 : Math.max(1, size.getHeight() - (i10 * 2));
            if (i11 != 0) {
                iMax = Math.max(1, size.getWidth() - i11);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapC3, iMax2, iMax, i11 == 0 ? size.getWidth() : 600, i10 == 0 ? size.getHeight() : HttpResponseStatus.ERROR_BAD_REQUEST);
            Intrinsics.i(bitmapCreateBitmap, "createBitmap(...)");
            C18212a c18212aA = C18212a.a(bitmapCreateBitmap, imageProxy.S2().c());
            Intrinsics.i(c18212aA, "fromBitmap(...)");
            AbstractC5232j<List<C17567a>> abstractC5232jW0 = this.scanner.w0(c18212aA);
            final Function1 function1 = new Function1() { // from class: Mp.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d.f(this.f21178a, (List) obj);
                }
            };
            abstractC5232jW0.g(new InterfaceC5229g() { // from class: Mp.b
                @Override // Td.InterfaceC5229g
                public final void onSuccess(Object obj) {
                    d.g(function1, obj);
                }
            }).e(new InterfaceC5228f() { // from class: Mp.c
                @Override // Td.InterfaceC5228f
                public final void onFailure(Exception exc) {
                    d.h(exc);
                }
            });
            AutoCloseableKt.a(imageProxy, null);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(d dVar, List list) {
        Intrinsics.g(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C17567a c17567a = (C17567a) obj;
            Intrinsics.g(c17567a);
            if (!StringsKt.r0(e.a(c17567a))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            dVar.onBarcodesScanned.invoke(arrayList);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
