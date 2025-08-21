package Uv;

import Uv.d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.medallia.digital.mobilesdk.l3;
import gw.C14416e;
import gw.C14419h;
import gw.InterfaceC14418g;
import gw.K;
import gw.L;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00020\u0001:\u0003# 'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J/\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J/\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J/\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J/\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J/\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J/\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u0010J\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010)R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010.¨\u00061"}, d2 = {"LUv/t;", "Ljava/io/Closeable;", "Lgw/g;", "source", "", "client", "<init>", "(Lgw/g;Z)V", "LUv/t$c;", "handler", "", "length", "flags", "streamId", "", "i", "(LUv/t$c;III)V", "padding", "", "LUv/c;", "h", "(IIII)Ljava/util/List;", "d", "m", "l", "(LUv/t$c;I)V", "u", "w", "p", "j", "g", "z", "c", "(LUv/t$c;)V", "requireSettings", "b", "(ZLUv/t$c;)Z", "close", "()V", "a", "Lgw/g;", "Z", "LUv/t$b;", "LUv/t$b;", "continuation", "LUv/d$a;", "LUv/d$a;", "hpackReader", "e", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class t implements Closeable {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f39180f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14418g source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b continuation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d.a hpackReader;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUv/t$a;", "", "<init>", "()V", "", "length", "flags", "padding", "b", "(III)I", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Uv.t$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int b(int length, int flags, int padding) throws IOException {
            if ((flags & 8) != 0) {
                length--;
            }
            if (padding <= length) {
                return length - padding;
            }
            throw new IOException("PROTOCOL_ERROR padding " + padding + " > remaining length " + length);
        }

        public final Logger a() {
            return t.f39180f;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\"\u0010\"\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR\"\u0010$\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0016\u001a\u0004\b\u0013\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\"\u0010(\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001a¨\u0006)"}, d2 = {"LUv/t$b;", "Lgw/K;", "Lgw/g;", "source", "<init>", "(Lgw/g;)V", "", "b", "()V", "Lgw/e;", "sink", "", "byteCount", "read", "(Lgw/e;J)J", "Lgw/L;", "timeout", "()Lgw/L;", "close", "a", "Lgw/g;", "", "I", "getLength", "()I", "g", "(I)V", "length", "c", "getFlags", "flags", "d", "getStreamId", "i", "streamId", "e", "left", "f", "getPadding", "h", "padding", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements K {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC14418g source;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int length;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int flags;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int streamId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int left;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int padding;

        @Override // gw.K, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public b(InterfaceC14418g source) {
            Intrinsics.j(source, "source");
            this.source = source;
        }

        private final void b() throws IOException {
            int i10 = this.streamId;
            int iA = Nv.h.A(this.source);
            this.left = iA;
            this.length = iA;
            int iB = Nv.h.b(this.source.readByte(), l3.f93323c);
            this.flags = Nv.h.b(this.source.readByte(), l3.f93323c);
            Companion companion = t.INSTANCE;
            if (companion.a().isLoggable(Level.FINE)) {
                companion.a().fine(e.f39087a.c(true, this.streamId, this.length, iB, this.flags));
            }
            int i11 = this.source.readInt() & a.e.API_PRIORITY_OTHER;
            this.streamId = i11;
            if (iB == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iB + " != TYPE_CONTINUATION");
            }
        }

        /* renamed from: a, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        public final void c(int i10) {
            this.flags = i10;
        }

        public final void d(int i10) {
            this.left = i10;
        }

        public final void g(int i10) {
            this.length = i10;
        }

        public final void h(int i10) {
            this.padding = i10;
        }

        public final void i(int i10) {
            this.streamId = i10;
        }

        @Override // gw.K
        public long read(C14416e sink, long byteCount) throws IOException {
            Intrinsics.j(sink, "sink");
            while (true) {
                int i10 = this.left;
                if (i10 != 0) {
                    long j10 = this.source.read(sink, Math.min(byteCount, i10));
                    if (j10 == -1) {
                        return -1L;
                    }
                    this.left -= (int) j10;
                    return j10;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                b();
            }
        }

        @Override // gw.K
        /* renamed from: timeout */
        public L getTimeout() {
            return this.source.getTimeout();
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J/\u0010.\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010/J-\u00102\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b2\u00103¨\u00064À\u0006\u0003"}, d2 = {"LUv/t$c;", "", "", "inFinished", "", "streamId", "Lgw/g;", "source", "length", "", "g", "(ZILgw/g;I)V", "associatedStreamId", "", "LUv/c;", "headerBlock", "a", "(ZIILjava/util/List;)V", "LUv/a;", "errorCode", "f", "(ILUv/a;)V", "clearPrevious", "LUv/y;", "settings", "e", "(ZLUv/y;)V", "d", "()V", "ack", "payload1", "payload2", "k", "(ZII)V", "lastGoodStreamId", "Lgw/h;", "debugData", "o", "(ILUv/a;Lgw/h;)V", "", "windowSizeIncrement", "b", "(IJ)V", "streamDependency", "weight", "exclusive", "l", "(IIIZ)V", "promisedStreamId", "requestHeaders", "c", "(IILjava/util/List;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        void a(boolean inFinished, int streamId, int associatedStreamId, List<Uv.c> headerBlock);

        void b(int streamId, long windowSizeIncrement);

        void c(int streamId, int promisedStreamId, List<Uv.c> requestHeaders) throws IOException;

        void d();

        void e(boolean clearPrevious, y settings);

        void f(int streamId, a errorCode);

        void g(boolean inFinished, int streamId, InterfaceC14418g source, int length) throws IOException;

        void k(boolean ack, int payload1, int payload2);

        void l(int streamId, int streamDependency, int weight, boolean exclusive);

        void o(int lastGoodStreamId, a errorCode, C14419h debugData);
    }

    private final void m(c handler, int length, int flags, int streamId) throws IOException {
        if (length == 5) {
            if (streamId == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            l(handler, streamId);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + length + " != 5");
        }
    }

    private final void u(c handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + length + " != 4");
        }
        if (streamId == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i10 = this.source.readInt();
        a aVarA = a.INSTANCE.a(i10);
        if (aVarA != null) {
            handler.f(streamId, aVarA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i10);
    }

    private final void z(c handler, int length, int flags, int streamId) throws Exception {
        int i10;
        try {
            if (length != 4) {
                throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + length);
            }
            try {
                long jD = Nv.h.d(this.source.readInt(), 2147483647L);
                if (jD == 0) {
                    throw new IOException("windowSizeIncrement was 0");
                }
                Logger logger = f39180f;
                if (logger.isLoggable(Level.FINE)) {
                    i10 = streamId;
                    logger.fine(e.f39087a.d(true, streamId, length, jD));
                } else {
                    i10 = streamId;
                }
                handler.b(i10, jD);
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                f39180f.fine(e.f39087a.c(true, streamId, length, 8, flags));
                throw exc;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        Intrinsics.i(logger, "getLogger(...)");
        f39180f = logger;
    }

    public t(InterfaceC14418g source, boolean z10) {
        Intrinsics.j(source, "source");
        this.source = source;
        this.client = z10;
        b bVar = new b(source);
        this.continuation = bVar;
        this.hpackReader = new d.a(bVar, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, 0, 4, null);
    }

    private final void d(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (flags & 1) != 0;
        if ((flags & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iB = (flags & 8) != 0 ? Nv.h.b(this.source.readByte(), l3.f93323c) : 0;
        handler.g(z10, streamId, this.source, INSTANCE.b(length, flags, iB));
        this.source.skip(iB);
    }

    private final void g(c handler, int length, int flags, int streamId) throws IOException {
        if (length < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + length);
        }
        if (streamId != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i10 = this.source.readInt();
        int i11 = this.source.readInt();
        int i12 = length - 8;
        a aVarA = a.INSTANCE.a(i11);
        if (aVarA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i11);
        }
        C14419h c14419hO1 = C14419h.f134558e;
        if (i12 > 0) {
            c14419hO1 = this.source.O1(i12);
        }
        handler.o(i10, aVarA, c14419hO1);
    }

    private final List<Uv.c> h(int length, int padding, int flags, int streamId) throws IOException {
        this.continuation.d(length);
        b bVar = this.continuation;
        bVar.g(bVar.getLeft());
        this.continuation.h(padding);
        this.continuation.c(flags);
        this.continuation.i(streamId);
        this.hpackReader.k();
        return this.hpackReader.e();
    }

    private final void i(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (flags & 1) != 0;
        int iB = (flags & 8) != 0 ? Nv.h.b(this.source.readByte(), l3.f93323c) : 0;
        if ((flags & 32) != 0) {
            l(handler, streamId);
            length -= 5;
        }
        handler.a(z10, streamId, -1, h(INSTANCE.b(length, flags, iB), iB, flags, streamId));
    }

    private final void j(c handler, int length, int flags, int streamId) throws IOException {
        if (length != 8) {
            throw new IOException("TYPE_PING length != 8: " + length);
        }
        if (streamId != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.k((flags & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void l(c handler, int streamId) throws IOException {
        int i10 = this.source.readInt();
        handler.l(streamId, i10 & a.e.API_PRIORITY_OTHER, Nv.h.b(this.source.readByte(), l3.f93323c) + 1, (Integer.MIN_VALUE & i10) != 0);
    }

    private final void p(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iB = (flags & 8) != 0 ? Nv.h.b(this.source.readByte(), l3.f93323c) : 0;
        handler.c(streamId, this.source.readInt() & a.e.API_PRIORITY_OTHER, h(INSTANCE.b(length - 4, flags, iB), iB, flags, streamId));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w(Uv.t.c r7, int r8, int r9, int r10) throws java.io.IOException {
        /*
            r6 = this;
            if (r10 != 0) goto Lb3
            r10 = 1
            r9 = r9 & r10
            if (r9 == 0) goto L14
            if (r8 != 0) goto Lc
            r7.d()
            return
        Lc:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r7.<init>(r8)
            throw r7
        L14:
            int r9 = r8 % 6
            if (r9 != 0) goto L9c
            Uv.y r9 = new Uv.y
            r9.<init>()
            r0 = 0
            kotlin.ranges.IntRange r8 = kotlin.ranges.RangesKt.x(r0, r8)
            r1 = 6
            kotlin.ranges.IntProgression r8 = kotlin.ranges.RangesKt.w(r8, r1)
            int r1 = r8.getFirst()
            int r2 = r8.getLast()
            int r8 = r8.getStep()
            if (r8 <= 0) goto L37
            if (r1 <= r2) goto L3b
        L37:
            if (r8 >= 0) goto L98
            if (r2 > r1) goto L98
        L3b:
            gw.g r3 = r6.source
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            int r3 = Nv.h.c(r3, r4)
            gw.g r4 = r6.source
            int r4 = r4.readInt()
            r5 = 2
            if (r3 == r5) goto L84
            r5 = 4
            if (r3 == r5) goto L79
            r5 = 5
            if (r3 == r5) goto L58
            goto L91
        L58:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L62
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L62
            goto L91
        L62:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L79:
            if (r4 < 0) goto L7c
            goto L91
        L7c:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r7.<init>(r8)
            throw r7
        L84:
            if (r4 == 0) goto L91
            if (r4 != r10) goto L89
            goto L91
        L89:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r7.<init>(r8)
            throw r7
        L91:
            r9.h(r3, r4)
            if (r1 == r2) goto L98
            int r1 = r1 + r8
            goto L3b
        L98:
            r7.e(r0, r9)
            return
        L9c:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "TYPE_SETTINGS length % 6 != 0: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        Lb3:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "TYPE_SETTINGS streamId != 0"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Uv.t.w(Uv.t$c, int, int, int):void");
    }

    public final boolean b(boolean requireSettings, c handler) throws Exception {
        Intrinsics.j(handler, "handler");
        try {
            this.source.C1(9L);
            int iA = Nv.h.A(this.source);
            if (iA > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iA);
            }
            int iB = Nv.h.b(this.source.readByte(), l3.f93323c);
            int iB2 = Nv.h.b(this.source.readByte(), l3.f93323c);
            int i10 = this.source.readInt() & a.e.API_PRIORITY_OTHER;
            if (iB != 8) {
                Logger logger = f39180f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.f39087a.c(true, i10, iA, iB, iB2));
                }
            }
            if (requireSettings && iB != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + e.f39087a.b(iB));
            }
            switch (iB) {
                case 0:
                    d(handler, iA, iB2, i10);
                    return true;
                case 1:
                    i(handler, iA, iB2, i10);
                    return true;
                case 2:
                    m(handler, iA, iB2, i10);
                    return true;
                case 3:
                    u(handler, iA, iB2, i10);
                    return true;
                case 4:
                    w(handler, iA, iB2, i10);
                    return true;
                case 5:
                    p(handler, iA, iB2, i10);
                    return true;
                case 6:
                    j(handler, iA, iB2, i10);
                    return true;
                case 7:
                    g(handler, iA, iB2, i10);
                    return true;
                case 8:
                    z(handler, iA, iB2, i10);
                    return true;
                default:
                    this.source.skip(iA);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(c handler) throws IOException {
        Intrinsics.j(handler, "handler");
        if (this.client) {
            if (!b(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC14418g interfaceC14418g = this.source;
        C14419h c14419h = e.CONNECTION_PREFACE;
        C14419h c14419hO1 = interfaceC14418g.O1(c14419h.V());
        Logger logger = f39180f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Nv.k.j("<< CONNECTION " + c14419hO1.E(), new Object[0]));
        }
        if (Intrinsics.e(c14419h, c14419hO1)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + c14419hO1.c0());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }
}
