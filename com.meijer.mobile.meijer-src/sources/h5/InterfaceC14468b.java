package h5;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import m5.AbstractC15670i;
import m5.C15669h;
import n5.Size;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0005J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lh5/b;", "", "Lh5/b$a;", "chain", "Lm5/i;", "a", "(Lh5/b$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: h5.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC14468b {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lh5/b$a;", "", "Lm5/h;", "getRequest", "()Lm5/h;", "request", "Ln5/i;", "getSize", "()Ln5/i;", "size", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: h5.b$a */
    public interface a {
        C15669h getRequest();

        Size getSize();
    }

    Object a(a aVar, Continuation<? super AbstractC15670i> continuation);
}
