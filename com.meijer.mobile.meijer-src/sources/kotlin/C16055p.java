package kotlin;

import androidx.compose.runtime.Composer;
import kotlin.AbstractC15880m;
import kotlin.C15857P;
import kotlin.InterfaceC15872e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bb\u0012,\u0010\u000b\u001a(\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\b\n\u0012#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012R=\u0010\u000b\u001a(\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\b\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R4\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lo0/p;", "Ln0/m;", "Lo0/l;", "Lkotlin/Function2;", "Lo0/u;", "", "Lkotlin/ParameterName;", "name", "page", "", "Lkotlin/ExtensionFunctionType;", "pageContent", "Lkotlin/Function1;", "index", "", "key", "pageCount", "<init>", "(Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;I)V", "a", "Lkotlin/jvm/functions/Function4;", "getPageContent", "()Lkotlin/jvm/functions/Function4;", "b", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "c", "I", "getPageCount", "()I", "Ln0/e;", "d", "Ln0/e;", "k", "()Ln0/e;", "intervals", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C16055p extends AbstractC15880m<C16051l> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function4<InterfaceC16060u, Integer, Composer, Integer, Unit> pageContent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<Integer, Object> key;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int pageCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15872e<C16051l> intervals;

    @Override // kotlin.AbstractC15880m
    public InterfaceC15872e<C16051l> k() {
        return this.intervals;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16055p(Function4<? super InterfaceC16060u, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Function1<? super Integer, ? extends Object> function1, int i10) {
        this.pageContent = function4;
        this.key = function1;
        this.pageCount = i10;
        C15857P c15857p = new C15857P();
        c15857p.b(i10, new C16051l(function1, function4));
        this.intervals = c15857p;
    }
}
