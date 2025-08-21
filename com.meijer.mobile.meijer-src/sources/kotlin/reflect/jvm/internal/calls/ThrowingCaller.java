package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.calls.Caller;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ThrowingCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "<init>", "()V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "d", "()Ljava/lang/Void;", "member", "", "Ljava/lang/reflect/Type;", "a", "()Ljava/util/List;", "parameterTypes", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ThrowingCaller implements Caller {

    /* renamed from: a, reason: collision with root package name */
    public static final ThrowingCaller f144097a = new ThrowingCaller();

    public Void d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public Object call(Object[] args) {
        Intrinsics.j(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public Type getReturnType() {
        Class TYPE = Void.TYPE;
        Intrinsics.i(TYPE, "TYPE");
        return TYPE;
    }

    private ThrowingCaller() {
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public List<Type> a() {
        return CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) d();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public boolean c() {
        return Caller.DefaultImpls.b(this);
    }
}
