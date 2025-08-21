package mg;

import B2.D;
import Ev.AbstractC3260b;
import androidx.datastore.core.CorruptionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lmg/i;", "LB2/D;", "Lmg/h;", "<init>", "()V", "Ljava/io/InputStream;", "input", "c", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "", "e", "(Lmg/h;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lmg/h;", "d", "()Lmg/h;", "defaultValue", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class i implements D<SessionConfigs> {

    /* renamed from: a, reason: collision with root package name */
    public static final i f151040a = new i();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final SessionConfigs defaultValue = new SessionConfigs(null, null, null, null, null);

    @Override // B2.D
    public Object c(InputStream inputStream, Continuation<? super SessionConfigs> continuation) throws CorruptionException {
        try {
            AbstractC3260b.Companion companion = AbstractC3260b.INSTANCE;
            String strD = StringsKt.D(ByteStreamsKt.c(inputStream));
            companion.getSerializersModule();
            return (SessionConfigs) companion.b(SessionConfigs.INSTANCE.serializer(), strD);
        } catch (Exception e10) {
            throw new CorruptionException("Cannot parse session configs", e10);
        }
    }

    @Override // B2.D
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SessionConfigs a() {
        return defaultValue;
    }

    @Override // B2.D
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object b(SessionConfigs sessionConfigs, OutputStream outputStream, Continuation<? super Unit> continuation) throws IOException {
        outputStream.write(StringsKt.E(AbstractC3260b.INSTANCE.c(SessionConfigs.INSTANCE.serializer(), sessionConfigs)));
        return Unit.f143329a;
    }

    private i() {
    }
}
