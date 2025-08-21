package l0;

import androidx.compose.runtime.Composer;
import kotlin.AbstractC15880m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u007f\u0012#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012#\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002\u0012,\u0010\u000e\u001a(\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010R7\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R7\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R=\u0010\u000e\u001a(\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Ll0/g;", "Ln0/m$a;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "", "key", "type", "Lkotlin/Function2;", "Ll0/c;", "", "Lkotlin/ExtensionFunctionType;", "item", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "a", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "b", "getType", "c", "Lkotlin/jvm/functions/Function4;", "()Lkotlin/jvm/functions/Function4;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: l0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15437g implements AbstractC15880m.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Integer, Object> key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<Integer, Object> type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> item;

    public final Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> a() {
        return this.item;
    }

    @Override // kotlin.AbstractC15880m.a
    public Function1<Integer, Object> getKey() {
        return this.key;
    }

    @Override // kotlin.AbstractC15880m.a
    public Function1<Integer, Object> getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15437g(Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> function12, Function4<? super InterfaceC15433c, ? super Integer, ? super Composer, ? super Integer, Unit> function4) {
        this.key = function1;
        this.type = function12;
        this.item = function4;
    }
}
