package kotlin;

import androidx.compose.runtime.Composer;
import kotlin.AbstractC15753m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BZ\u0012#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012,\u0010\r\u001a(\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fR7\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R=\u0010\r\u001a(\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u0017"}, d2 = {"Lo0/l;", "Ln0/m$a;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "page", "", "key", "Lkotlin/Function2;", "Lo0/u;", "", "Lkotlin/ExtensionFunctionType;", "item", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "a", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "b", "Lkotlin/jvm/functions/Function4;", "()Lkotlin/jvm/functions/Function4;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15976l implements AbstractC15753m.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Integer, Object> key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function4<InterfaceC15985u, Integer, Composer, Integer, Unit> item;

    public final Function4<InterfaceC15985u, Integer, Composer, Integer, Unit> a() {
        return this.item;
    }

    @Override // kotlin.AbstractC15753m.a
    public Function1<Integer, Object> getKey() {
        return this.key;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15976l(Function1<? super Integer, ? extends Object> function1, Function4<? super InterfaceC15985u, ? super Integer, ? super Composer, ? super Integer, Unit> function4) {
        this.key = function1;
        this.item = function4;
    }
}
