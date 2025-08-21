package ov;

import kotlin.Metadata;
import rv.C16951F;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lov/g;", "E", "Lov/w;", "Lov/v;", "x3", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface g<E> extends w<E>, v<E> {

    /* renamed from: x3, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f155885a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lov/g$a;", "", "<init>", "()V", "", "b", "I", "a", "()I", "CHANNEL_DEFAULT_CAPACITY", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ov.g$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f155885a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final int CHANNEL_DEFAULT_CAPACITY = C16951F.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        public final int a() {
            return CHANNEL_DEFAULT_CAPACITY;
        }

        private Companion() {
        }
    }
}
