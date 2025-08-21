package e5;

import gw.AbstractC14423l;
import gw.AbstractC14424m;
import gw.B;
import gw.InterfaceC14417f;
import gw.J;
import gw.w;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import mv.AbstractC15779K;
import mv.C15784P;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.X0;
import r5.C16841e;

@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\b\u0005*\u0001^\b\u0000\u0018\u0000 a2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0004=:;8B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u0013J#\u0010!\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u001dR\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020\u001f2\n\u0010&\u001a\u00060%R\u00020\u0000H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010\u0013J\u000f\u0010*\u001a\u00020\u0011H\u0002¢\u0006\u0004\b*\u0010\u0013J\u000f\u0010+\u001a\u00020\u001fH\u0002¢\u0006\u0004\b+\u0010$J\u000f\u0010,\u001a\u00020\u0011H\u0002¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\u0011H\u0002¢\u0006\u0004\b-\u0010\u0013J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u0010\u001aJ\r\u00100\u001a\u00020\u0011¢\u0006\u0004\b0\u0010\u0013J\u001e\u00102\u001a\b\u0018\u000101R\u00020\u00002\u0006\u0010.\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\b\u0018\u00010\u001dR\u00020\u00002\u0006\u0010.\u001a\u00020\u0017¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u0010\u0013J\u000f\u00107\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00109R\u0014\u0010A\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00109R\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00109R$\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\b\u0012\u00060%R\u00020\u00000D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u00102R\u0016\u0010O\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010<R\u0018\u0010R\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0016\u0010Y\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010TR\u0016\u0010[\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010TR\u0016\u0010]\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010TR\u0014\u0010\u0005\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006b"}, d2 = {"Le5/c;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Ljava/io/Flushable;", "Lgw/l;", "fileSystem", "Lgw/B;", "directory", "Lmv/K;", "cleanupDispatcher", "", "maxSize", "", "appVersion", "valueCount", "<init>", "(Lgw/l;Lgw/B;Lmv/K;JII)V", "", "e0", "()V", "Lgw/f;", "T", "()Lgw/f;", "", "line", "h0", "(Ljava/lang/String;)V", "b0", "o0", "Le5/c$b;", "editor", "", "success", "B", "(Le5/c$b;Z)V", "O", "()Z", "Le5/c$c;", "entry", "j0", "(Le5/c$c;)Z", "A", "m0", "k0", "D", "R", "key", "n0", "K", "Le5/c$d;", "J", "(Ljava/lang/String;)Le5/c$d;", "H", "(Ljava/lang/String;)Le5/c$b;", "close", "flush", "a", "Lgw/B;", "b", "c", "I", "d", "e", "journalFile", "f", "journalFileTmp", "g", "journalFileBackup", "Ljava/util/LinkedHashMap;", "h", "Ljava/util/LinkedHashMap;", "lruEntries", "Lmv/O;", "i", "Lmv/O;", "cleanupScope", "j", "size", "k", "operationsSinceRewrite", "l", "Lgw/f;", "journalWriter", "m", "Z", "hasJournalErrors", "n", "initialized", "o", "closed", "p", "mostRecentTrimFailed", "q", "mostRecentRebuildFailed", "e5/c$e", "r", "Le5/c$e;", "s", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: t, reason: collision with root package name */
    private static final Regex f129951t = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final B directory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long maxSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int appVersion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int valueCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final B journalFile;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final B journalFileTmp;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final B journalFileBackup;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashMap<String, C2042c> lruEntries;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O cleanupScope;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int operationsSinceRewrite;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private InterfaceC14417f journalWriter;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean hasJournalErrors;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean initialized;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean mostRecentTrimFailed;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean mostRecentRebuildFailed;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final e fileSystem;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0018\u00010\u0014R\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Le5/c$b;", "", "Le5/c$c;", "Le5/c;", "entry", "<init>", "(Le5/c;Le5/c$c;)V", "", "success", "", "d", "(Z)V", "", "index", "Lgw/B;", "f", "(I)Lgw/B;", "e", "()V", "b", "Le5/c$d;", "c", "()Le5/c$d;", "a", "Le5/c$c;", "g", "()Le5/c$c;", "Z", "closed", "", "[Z", "h", "()[Z", "written", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C2042c entry;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean[] written;

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public b(C2042c c2042c) {
            this.entry = c2042c;
            this.written = new boolean[c.this.valueCount];
        }

        private final void d(boolean success) {
            c cVar = c.this;
            synchronized (cVar) {
                try {
                    if (this.closed) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (Intrinsics.e(this.entry.getCurrentEditor(), this)) {
                        cVar.B(this, success);
                    }
                    this.closed = true;
                    Unit unit = Unit.f143329a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final d c() {
            d dVarJ;
            c cVar = c.this;
            synchronized (cVar) {
                b();
                dVarJ = cVar.J(this.entry.getKey());
            }
            return dVarJ;
        }

        public final void e() {
            if (Intrinsics.e(this.entry.getCurrentEditor(), this)) {
                this.entry.m(true);
            }
        }

        public final B f(int index) {
            B b10;
            c cVar = c.this;
            synchronized (cVar) {
                if (this.closed) {
                    throw new IllegalStateException("editor is closed");
                }
                this.written[index] = true;
                B b11 = this.entry.c().get(index);
                C16841e.a(cVar.fileSystem, b11);
                b10 = b11;
            }
            return b10;
        }

        /* renamed from: g, reason: from getter */
        public final C2042c getEntry() {
            return this.entry;
        }

        /* renamed from: h, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0013\u0010!R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b\u001f\u0010!R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R(\u00104\u001a\b\u0018\u00010/R\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00100\u001a\u0004\b\u0018\u00101\"\u0004\b2\u00103R\"\u0010:\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u00106\u001a\u0004\b+\u00107\"\u0004\b8\u00109¨\u0006;"}, d2 = {"Le5/c$c;", "", "", "key", "<init>", "(Le5/c;Ljava/lang/String;)V", "", "strings", "", "j", "(Ljava/util/List;)V", "Lgw/f;", "writer", "o", "(Lgw/f;)V", "Le5/c$d;", "Le5/c;", "n", "()Le5/c$d;", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "", "b", "[J", "e", "()[J", "lengths", "Ljava/util/ArrayList;", "Lgw/B;", "c", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "cleanFiles", "dirtyFiles", "", "Z", "g", "()Z", "l", "(Z)V", "readable", "f", "h", "m", "zombie", "Le5/c$b;", "Le5/c$b;", "()Le5/c$b;", "i", "(Le5/c$b;)V", "currentEditor", "", "I", "()I", "k", "(I)V", "lockingSnapshotCount", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: e5.c$c, reason: collision with other inner class name */
    public final class C2042c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long[] lengths;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<B> cleanFiles;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<B> dirtyFiles;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean readable;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean zombie;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private b currentEditor;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int lockingSnapshotCount;

        public C2042c(String str) {
            this.key = str;
            this.lengths = new long[c.this.valueCount];
            this.cleanFiles = new ArrayList<>(c.this.valueCount);
            this.dirtyFiles = new ArrayList<>(c.this.valueCount);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int i10 = c.this.valueCount;
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.cleanFiles.add(c.this.directory.w(sb2.toString()));
                sb2.append(".tmp");
                this.dirtyFiles.add(c.this.directory.w(sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final ArrayList<B> a() {
            return this.cleanFiles;
        }

        /* renamed from: b, reason: from getter */
        public final b getCurrentEditor() {
            return this.currentEditor;
        }

        public final ArrayList<B> c() {
            return this.dirtyFiles;
        }

        /* renamed from: d, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: e, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* renamed from: f, reason: from getter */
        public final int getLockingSnapshotCount() {
            return this.lockingSnapshotCount;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void i(b bVar) {
            this.currentEditor = bVar;
        }

        public final void k(int i10) {
            this.lockingSnapshotCount = i10;
        }

        public final void l(boolean z10) {
            this.readable = z10;
        }

        public final void m(boolean z10) {
            this.zombie = z10;
        }

        public final d n() {
            if (!this.readable || this.currentEditor != null || this.zombie) {
                return null;
            }
            ArrayList<B> arrayList = this.cleanFiles;
            c cVar = c.this;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!cVar.fileSystem.m(arrayList.get(i10))) {
                    try {
                        cVar.j0(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.lockingSnapshotCount++;
            return c.this.new d(this);
        }

        public final void o(InterfaceC14417f writer) throws IOException {
            for (long j10 : this.lengths) {
                writer.writeByte(32).G1(j10);
            }
        }

        public final void j(List<String> strings) throws IOException {
            if (strings.size() == c.this.valueCount) {
                try {
                    int size = strings.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        this.lengths[i10] = Long.parseLong(strings.get(i10));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + strings);
                }
            }
            throw new IOException("unexpected journal line: " + strings);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0005\u001a\u00060\u0003R\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0019"}, d2 = {"Le5/c$d;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Le5/c$c;", "Le5/c;", "entry", "<init>", "(Le5/c;Le5/c$c;)V", "", "index", "Lgw/B;", "b", "(I)Lgw/B;", "", "close", "()V", "Le5/c$b;", "a", "()Le5/c$b;", "Le5/c$c;", "getEntry", "()Le5/c$c;", "", "Z", "closed", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public final class d implements Closeable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C2042c entry;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public d(C2042c c2042c) {
            this.entry = c2042c;
        }

        public final b a() {
            b bVarH;
            c cVar = c.this;
            synchronized (cVar) {
                close();
                bVarH = cVar.H(this.entry.getKey());
            }
            return bVarH;
        }

        public final B b(int index) {
            if (this.closed) {
                throw new IllegalStateException("snapshot is closed");
            }
            return this.entry.a().get(index);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            c cVar = c.this;
            synchronized (cVar) {
                try {
                    this.entry.k(r1.getLockingSnapshotCount() - 1);
                    if (this.entry.getLockingSnapshotCount() == 0 && this.entry.getZombie()) {
                        cVar.j0(this.entry);
                    }
                    Unit unit = Unit.f143329a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f129986a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f129986a == 0) {
                ResultKt.b(obj);
                c cVar = c.this;
                synchronized (cVar) {
                    if (cVar.initialized && !cVar.closed) {
                        try {
                            cVar.m0();
                        } catch (IOException unused) {
                            cVar.mostRecentTrimFailed = true;
                        }
                        try {
                            if (cVar.O()) {
                                cVar.o0();
                            }
                        } catch (IOException unused2) {
                            cVar.mostRecentRebuildFailed = true;
                            cVar.journalWriter = w.b(w.a());
                        }
                        return Unit.f143329a;
                    }
                    return Unit.f143329a;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void B(b editor, boolean success) {
        C2042c entry = editor.getEntry();
        if (!Intrinsics.e(entry.getCurrentEditor(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        int i10 = 0;
        if (!success || entry.getZombie()) {
            int i11 = this.valueCount;
            while (i10 < i11) {
                this.fileSystem.j(entry.c().get(i10));
                i10++;
            }
        } else {
            int i12 = this.valueCount;
            for (int i13 = 0; i13 < i12; i13++) {
                if (editor.getWritten()[i13] && !this.fileSystem.m(entry.c().get(i13))) {
                    editor.a();
                    return;
                }
            }
            int i14 = this.valueCount;
            while (i10 < i14) {
                B b10 = entry.c().get(i10);
                B b11 = entry.a().get(i10);
                if (this.fileSystem.m(b10)) {
                    this.fileSystem.c(b10, b11);
                } else {
                    C16841e.a(this.fileSystem, entry.a().get(i10));
                }
                long j10 = entry.getLengths()[i10];
                Long size = this.fileSystem.u(b11).getSize();
                long jLongValue = size != null ? size.longValue() : 0L;
                entry.getLengths()[i10] = jLongValue;
                this.size = (this.size - j10) + jLongValue;
                i10++;
            }
        }
        entry.i(null);
        if (entry.getZombie()) {
            j0(entry);
            return;
        }
        this.operationsSinceRewrite++;
        InterfaceC14417f interfaceC14417f = this.journalWriter;
        Intrinsics.g(interfaceC14417f);
        if (success || entry.getReadable()) {
            entry.l(true);
            interfaceC14417f.G0("CLEAN");
            interfaceC14417f.writeByte(32);
            interfaceC14417f.G0(entry.getKey());
            entry.o(interfaceC14417f);
            interfaceC14417f.writeByte(10);
        } else {
            this.lruEntries.remove(entry.getKey());
            interfaceC14417f.G0("REMOVE");
            interfaceC14417f.writeByte(32);
            interfaceC14417f.G0(entry.getKey());
            interfaceC14417f.writeByte(10);
        }
        interfaceC14417f.flush();
        if (this.size > this.maxSize || O()) {
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(c cVar, IOException iOException) {
        cVar.hasJournalErrors = true;
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void o0() {
        Throwable th2;
        try {
            InterfaceC14417f interfaceC14417f = this.journalWriter;
            if (interfaceC14417f != null) {
                interfaceC14417f.close();
            }
            InterfaceC14417f interfaceC14417fB = w.b(this.fileSystem.B(this.journalFileTmp, false));
            try {
                interfaceC14417fB.G0("libcore.io.DiskLruCache").writeByte(10);
                interfaceC14417fB.G0("1").writeByte(10);
                interfaceC14417fB.G1(this.appVersion).writeByte(10);
                interfaceC14417fB.G1(this.valueCount).writeByte(10);
                interfaceC14417fB.writeByte(10);
                for (C2042c c2042c : this.lruEntries.values()) {
                    if (c2042c.getCurrentEditor() != null) {
                        interfaceC14417fB.G0("DIRTY");
                        interfaceC14417fB.writeByte(32);
                        interfaceC14417fB.G0(c2042c.getKey());
                        interfaceC14417fB.writeByte(10);
                    } else {
                        interfaceC14417fB.G0("CLEAN");
                        interfaceC14417fB.writeByte(32);
                        interfaceC14417fB.G0(c2042c.getKey());
                        c2042c.o(interfaceC14417fB);
                        interfaceC14417fB.writeByte(10);
                    }
                }
                Unit unit = Unit.f143329a;
                if (interfaceC14417fB != null) {
                    try {
                        interfaceC14417fB.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } else {
                    th2 = null;
                }
            } catch (Throwable th4) {
                if (interfaceC14417fB != null) {
                    try {
                        interfaceC14417fB.close();
                    } catch (Throwable th5) {
                        ExceptionsKt.a(th4, th5);
                    }
                }
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            if (this.fileSystem.m(this.journalFile)) {
                this.fileSystem.c(this.journalFile, this.journalFileBackup);
                this.fileSystem.c(this.journalFileTmp, this.journalFile);
                this.fileSystem.j(this.journalFileBackup);
            } else {
                this.fileSystem.c(this.journalFileTmp, this.journalFile);
            }
            this.journalWriter = T();
            this.operationsSinceRewrite = 0;
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    public final synchronized b H(String key) {
        A();
        n0(key);
        K();
        C2042c c2042c = this.lruEntries.get(key);
        if ((c2042c != null ? c2042c.getCurrentEditor() : null) != null) {
            return null;
        }
        if (c2042c != null && c2042c.getLockingSnapshotCount() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            InterfaceC14417f interfaceC14417f = this.journalWriter;
            Intrinsics.g(interfaceC14417f);
            interfaceC14417f.G0("DIRTY");
            interfaceC14417f.writeByte(32);
            interfaceC14417f.G0(key);
            interfaceC14417f.writeByte(10);
            interfaceC14417f.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (c2042c == null) {
                c2042c = new C2042c(key);
                this.lruEntries.put(key, c2042c);
            }
            b bVar = new b(c2042c);
            c2042c.i(bVar);
            return bVar;
        }
        R();
        return null;
    }

    public final synchronized d J(String key) {
        d dVarN;
        A();
        n0(key);
        K();
        C2042c c2042c = this.lruEntries.get(key);
        if (c2042c != null && (dVarN = c2042c.n()) != null) {
            this.operationsSinceRewrite++;
            InterfaceC14417f interfaceC14417f = this.journalWriter;
            Intrinsics.g(interfaceC14417f);
            interfaceC14417f.G0("READ");
            interfaceC14417f.writeByte(32);
            interfaceC14417f.G0(key);
            interfaceC14417f.writeByte(10);
            if (O()) {
                R();
            }
            return dVarN;
        }
        return null;
    }

    public final synchronized void K() {
        try {
            if (this.initialized) {
                return;
            }
            this.fileSystem.j(this.journalFileTmp);
            if (this.fileSystem.m(this.journalFileBackup)) {
                if (this.fileSystem.m(this.journalFile)) {
                    this.fileSystem.j(this.journalFileBackup);
                } else {
                    this.fileSystem.c(this.journalFileBackup, this.journalFile);
                }
            }
            if (this.fileSystem.m(this.journalFile)) {
                try {
                    e0();
                    b0();
                    this.initialized = true;
                    return;
                } catch (IOException unused) {
                    try {
                        D();
                        this.closed = false;
                    } catch (Throwable th2) {
                        this.closed = false;
                        throw th2;
                    }
                }
            }
            o0();
            this.initialized = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.initialized && !this.closed) {
                for (C2042c c2042c : (C2042c[]) this.lruEntries.values().toArray(new C2042c[0])) {
                    b currentEditor = c2042c.getCurrentEditor();
                    if (currentEditor != null) {
                        currentEditor.e();
                    }
                }
                m0();
                C15784P.f(this.cleanupScope, null, 1, null);
                InterfaceC14417f interfaceC14417f = this.journalWriter;
                Intrinsics.g(interfaceC14417f);
                interfaceC14417f.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.initialized) {
            A();
            m0();
            InterfaceC14417f interfaceC14417f = this.journalWriter;
            Intrinsics.g(interfaceC14417f);
            interfaceC14417f.flush();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"e5/c$e", "Lgw/m;", "Lgw/B;", "file", "", "mustCreate", "Lgw/J;", "B", "(Lgw/B;Z)Lgw/J;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class e extends AbstractC14424m {
        e(AbstractC14423l abstractC14423l) {
            super(abstractC14423l);
        }

        @Override // gw.AbstractC14424m, gw.AbstractC14423l
        public J B(B file, boolean mustCreate) throws IOException {
            B bP = file.p();
            if (bP != null) {
                d(bP);
            }
            return super.B(file, mustCreate);
        }
    }

    private final void A() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O() {
        return this.operationsSinceRewrite >= 2000;
    }

    private final void R() {
        C15809k.d(this.cleanupScope, null, null, new f(null), 3, null);
    }

    private final InterfaceC14417f T() {
        return w.b(new e5.d(this.fileSystem.a(this.journalFile), new Function1() { // from class: e5.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.Y(this.f129949a, (IOException) obj);
            }
        }));
    }

    private final void b0() throws IOException {
        Iterator<C2042c> it = this.lruEntries.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            C2042c next = it.next();
            int i10 = 0;
            if (next.getCurrentEditor() == null) {
                int i11 = this.valueCount;
                while (i10 < i11) {
                    j10 += next.getLengths()[i10];
                    i10++;
                }
            } else {
                next.i(null);
                int i12 = this.valueCount;
                while (i10 < i12) {
                    this.fileSystem.j(next.a().get(i10));
                    this.fileSystem.j(next.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.size = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e0() throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            e5.c$e r1 = r10.fileSystem
            gw.B r2 = r10.journalFile
            gw.K r1 = r1.D(r2)
            gw.g r1 = gw.w.c(r1)
            java.lang.String r2 = r1.i1()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r1.i1()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r1.i1()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = r1.i1()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = r1.i1()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = kotlin.jvm.internal.Intrinsics.e(r7, r2)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            java.lang.String r7 = "1"
            boolean r7 = kotlin.jvm.internal.Intrinsics.e(r7, r3)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r10.appVersion     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.Intrinsics.e(r7, r4)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r10.valueCount     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.Intrinsics.e(r7, r5)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L5b
            if (r7 > 0) goto L82
            r0 = 0
        L51:
            java.lang.String r2 = r1.i1()     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            r10.h0(r2)     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            int r0 = r0 + 1
            goto L51
        L5b:
            r0 = move-exception
            goto Lb6
        L5d:
            java.util.LinkedHashMap<java.lang.String, e5.c$c> r2 = r10.lruEntries     // Catch: java.lang.Throwable -> L5b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L5b
            int r0 = r0 - r2
            r10.operationsSinceRewrite = r0     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r1.i2()     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L70
            r10.o0()     // Catch: java.lang.Throwable -> L5b
            goto L76
        L70:
            gw.f r0 = r10.T()     // Catch: java.lang.Throwable -> L5b
            r10.journalWriter = r0     // Catch: java.lang.Throwable -> L5b
        L76:
            kotlin.Unit r0 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L80
            r1.close()     // Catch: java.lang.Throwable -> L7e
            goto L80
        L7e:
            r0 = move-exception
            goto Lc0
        L80:
            r0 = 0
            goto Lc0
        L82:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r8.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r9 = "unexpected journal header: ["
            r8.append(r9)     // Catch: java.lang.Throwable -> L5b
            r8.append(r2)     // Catch: java.lang.Throwable -> L5b
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b
            r8.append(r3)     // Catch: java.lang.Throwable -> L5b
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b
            r8.append(r4)     // Catch: java.lang.Throwable -> L5b
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b
            r8.append(r5)     // Catch: java.lang.Throwable -> L5b
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b
            r8.append(r6)     // Catch: java.lang.Throwable -> L5b
            r0 = 93
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L5b
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L5b
            throw r7     // Catch: java.lang.Throwable -> L5b
        Lb6:
            if (r1 == 0) goto Lc0
            r1.close()     // Catch: java.lang.Throwable -> Lbc
            goto Lc0
        Lbc:
            r1 = move-exception
            kotlin.ExceptionsKt.a(r0, r1)
        Lc0:
            if (r0 != 0) goto Lc3
            return
        Lc3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.c.e0():void");
    }

    private final void h0(String line) throws IOException {
        String strSubstring;
        int iP0 = StringsKt.p0(line, ' ', 0, false, 6, null);
        if (iP0 == -1) {
            throw new IOException("unexpected journal line: " + line);
        }
        int i10 = iP0 + 1;
        int iP02 = StringsKt.p0(line, ' ', i10, false, 4, null);
        if (iP02 == -1) {
            strSubstring = line.substring(i10);
            Intrinsics.i(strSubstring, "substring(...)");
            if (iP0 == 6 && StringsKt.W(line, "REMOVE", false, 2, null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = line.substring(i10, iP02);
            Intrinsics.i(strSubstring, "substring(...)");
        }
        LinkedHashMap<String, C2042c> linkedHashMap = this.lruEntries;
        C2042c c2042c = linkedHashMap.get(strSubstring);
        if (c2042c == null) {
            c2042c = new C2042c(strSubstring);
            linkedHashMap.put(strSubstring, c2042c);
        }
        C2042c c2042c2 = c2042c;
        if (iP02 != -1 && iP0 == 5 && StringsKt.W(line, "CLEAN", false, 2, null)) {
            String strSubstring2 = line.substring(iP02 + 1);
            Intrinsics.i(strSubstring2, "substring(...)");
            List<String> listA1 = StringsKt.a1(strSubstring2, new char[]{' '}, false, 0, 6, null);
            c2042c2.l(true);
            c2042c2.i(null);
            c2042c2.j(listA1);
            return;
        }
        if (iP02 == -1 && iP0 == 5 && StringsKt.W(line, "DIRTY", false, 2, null)) {
            c2042c2.i(new b(c2042c2));
            return;
        }
        if (iP02 == -1 && iP0 == 4 && StringsKt.W(line, "READ", false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + line);
    }

    private final boolean k0() throws IOException {
        for (C2042c c2042c : this.lruEntries.values()) {
            if (!c2042c.getZombie()) {
                j0(c2042c);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0() {
        while (this.size > this.maxSize) {
            if (!k0()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    private final void n0(String key) {
        if (f129951t.j(key)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + key + '\"').toString());
    }

    public c(AbstractC14423l abstractC14423l, B b10, AbstractC15779K abstractC15779K, long j10, int i10, int i11) {
        this.directory = b10;
        this.maxSize = j10;
        this.appVersion = i10;
        this.valueCount = i11;
        if (j10 > 0) {
            if (i11 > 0) {
                this.journalFile = b10.w("journal");
                this.journalFileTmp = b10.w("journal.tmp");
                this.journalFileBackup = b10.w("journal.bkp");
                this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
                this.cleanupScope = C15784P.a(X0.b(null, 1, null).n0(abstractC15779K.Q0(1)));
                this.fileSystem = new e(abstractC14423l);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private final void D() throws IOException {
        close();
        C16841e.b(this.fileSystem, this.directory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j0(C2042c entry) throws IOException {
        InterfaceC14417f interfaceC14417f;
        if (entry.getLockingSnapshotCount() > 0 && (interfaceC14417f = this.journalWriter) != null) {
            interfaceC14417f.G0("DIRTY");
            interfaceC14417f.writeByte(32);
            interfaceC14417f.G0(entry.getKey());
            interfaceC14417f.writeByte(10);
            interfaceC14417f.flush();
        }
        if (entry.getLockingSnapshotCount() <= 0 && entry.getCurrentEditor() == null) {
            int i10 = this.valueCount;
            for (int i11 = 0; i11 < i10; i11++) {
                this.fileSystem.j(entry.a().get(i11));
                this.size -= entry.getLengths()[i11];
                entry.getLengths()[i11] = 0;
            }
            this.operationsSinceRewrite++;
            InterfaceC14417f interfaceC14417f2 = this.journalWriter;
            if (interfaceC14417f2 != null) {
                interfaceC14417f2.G0("REMOVE");
                interfaceC14417f2.writeByte(32);
                interfaceC14417f2.G0(entry.getKey());
                interfaceC14417f2.writeByte(10);
            }
            this.lruEntries.remove(entry.getKey());
            if (O()) {
                R();
            }
            return true;
        }
        entry.m(true);
        return true;
    }
}
