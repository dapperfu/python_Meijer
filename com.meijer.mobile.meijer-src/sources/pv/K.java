package pv;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import ov.EnumC16325a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpv/K;", "T", "", "Lpv/f;", "upstream", "", "extraBufferCapacity", "Lov/a;", "onBufferOverflow", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lpv/f;ILov/a;Lkotlin/coroutines/CoroutineContext;)V", "a", "Lpv/f;", "b", "I", "c", "Lov/a;", "d", "Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
final class K<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final InterfaceC16561f<T> upstream;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final int extraBufferCapacity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final EnumC16325a onBufferOverflow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final CoroutineContext context;

    /* JADX WARN: Multi-variable type inference failed */
    public K(InterfaceC16561f<? extends T> interfaceC16561f, int i10, EnumC16325a enumC16325a, CoroutineContext coroutineContext) {
        this.upstream = interfaceC16561f;
        this.extraBufferCapacity = i10;
        this.onBufferOverflow = enumC16325a;
        this.context = coroutineContext;
    }
}
