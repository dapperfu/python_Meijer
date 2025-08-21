package jg;

import Ev.AbstractC3260b;
import androidx.datastore.core.CorruptionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ljg/F;", "LB2/D;", "Ljg/E;", "Ljg/N;", "sessionGenerator", "<init>", "(Ljg/N;)V", "Ljava/io/InputStream;", "input", "c", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "", "e", "(Ljg/E;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljg/N;", "d", "()Ljg/E;", "defaultValue", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class F implements B2.D<SessionData> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final N sessionGenerator;

    public F(N sessionGenerator) {
        Intrinsics.j(sessionGenerator, "sessionGenerator");
        this.sessionGenerator = sessionGenerator;
    }

    @Override // B2.D
    public Object c(InputStream inputStream, Continuation<? super SessionData> continuation) throws CorruptionException {
        try {
            AbstractC3260b.Companion companion = AbstractC3260b.INSTANCE;
            String strD = StringsKt.D(ByteStreamsKt.c(inputStream));
            companion.getSerializersModule();
            return (SessionData) companion.b(SessionData.INSTANCE.serializer(), strD);
        } catch (Exception e10) {
            throw new CorruptionException("Cannot parse session data", e10);
        }
    }

    @Override // B2.D
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SessionData a() {
        return new SessionData(this.sessionGenerator.a(null), (Time) null, (Map) null, 6, (DefaultConstructorMarker) null);
    }

    @Override // B2.D
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object b(SessionData sessionData, OutputStream outputStream, Continuation<? super Unit> continuation) throws IOException {
        outputStream.write(StringsKt.E(AbstractC3260b.INSTANCE.c(SessionData.INSTANCE.serializer(), sessionData)));
        return Unit.f143329a;
    }
}
