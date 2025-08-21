package kotlin;

import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import kotlin.C6418E;
import kotlin.C6439a;
import kotlin.CubicBezierEasing;
import kotlin.InterfaceC6452i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.n0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aA\u0010\u0007\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lc0/a;", "LH1/h;", "target", "Lh0/i;", "from", "to", "", "d", "(Lc0/a;FLh0/i;Lh0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc0/n0;", "a", "Lc0/n0;", "DefaultIncomingSpec", "b", "DefaultOutgoingSpec", "c", "HoveredOutgoingSpec", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18010i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final n0<H1.h> f169072a = new n0<>(BinsView.TOTE_HEIGHT_DP, 0, C6418E.c(), 2, null);

    /* renamed from: b, reason: collision with root package name */
    private static final n0<H1.h> f169073b = new n0<>(BinsView.TOTE_WIDTH_DP, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: c, reason: collision with root package name */
    private static final n0<H1.h> f169074c = new n0<>(BinsView.TOTE_HEIGHT_DP, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    public static final Object d(C6439a<H1.h, ?> c6439a, float f10, h0.i iVar, h0.i iVar2, Continuation<? super Unit> continuation) {
        InterfaceC6452i<H1.h> interfaceC6452iA = iVar2 != null ? C18007h0.f169014a.a(iVar2) : iVar != null ? C18007h0.f169014a.b(iVar) : null;
        if (interfaceC6452iA != null) {
            Object objF = C6439a.f(c6439a, H1.h.l(f10), interfaceC6452iA, null, null, continuation, 12, null);
            return objF == IntrinsicsKt.f() ? objF : Unit.f143329a;
        }
        Object objT = c6439a.t(H1.h.l(f10), continuation);
        return objT == IntrinsicsKt.f() ? objT : Unit.f143329a;
    }
}
