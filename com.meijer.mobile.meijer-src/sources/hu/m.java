package hu;

import com.squareup.wire.ProtoAdapter;
import gw.C14419h;
import gw.M;
import hu.o;
import j$.time.Duration;
import j$.time.Instant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0000H\u0000¢\u0006\u0004\b\f\u0010\u0003\u001a\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0000H\u0000¢\u0006\u0004\b\r\u0010\u0003\u001a\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u0003\u001a\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0003\u001a\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0003\u001a\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u0003\u001a\u0019\u0010\u001c\u001a\f\u0012\b\u0012\u00060\u001aj\u0002`\u001b0\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u0003\u001a\u0019\u0010\u001f\u001a\f\u0012\b\u0012\u00060\u001dj\u0002`\u001e0\u0000H\u0000¢\u0006\u0004\b\u001f\u0010\u0003\u001a\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0000H\u0000¢\u0006\u0004\b!\u0010\u0003\u001a!\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0002\b\u0003\u0018\u00010\"0\u0000H\u0000¢\u0006\u0004\b#\u0010\u0003\u001a\u001b\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010$0\u0000H\u0000¢\u0006\u0004\b%\u0010\u0003\u001a\u0017\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u0000H\u0000¢\u0006\u0004\b'\u0010\u0003\u001a\u0017\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u0000H\u0000¢\u0006\u0004\b)\u0010\u0003\u001a7\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0000\"\b\b\u0000\u0010**\u00020(2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010,\u001a\u00020\u0016H\u0000¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/squareup/wire/ProtoAdapter;", "", "a", "()Lcom/squareup/wire/ProtoAdapter;", "", "j", "u", "n", "f", "l", "", "k", "v", "o", "g", "m", "Lhu/f;", "h", "()Lhu/f;", "Lhu/b;", "c", "()Lhu/b;", "", "p", "Lgw/h;", "b", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "d", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "i", "", "e", "", "r", "", "q", "", "s", "", "t", "T", "delegate", "typeUrl", "w", "(Lcom/squareup/wire/ProtoAdapter;Ljava/lang/String;)Lcom/squareup/wire/ProtoAdapter;", "wire-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m {

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"hu/m$a", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "o", "(Z)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Z)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/lang/Boolean;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<Boolean> {
        public int o(boolean value) {
            return 1;
        }

        a(hu.d dVar, KClass<Boolean> kClass, hu.q qVar) {
            super(dVar, kClass, null, qVar, Boolean.FALSE, null, 32, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void e(hu.o oVar, Boolean bool) throws IOException {
            n(oVar, bool.booleanValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int g(Boolean bool) {
            return o(bool.booleanValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Boolean c(hu.n reader) {
            Intrinsics.j(reader, "reader");
            return Boolean.valueOf(reader.o() != 0);
        }

        public void n(hu.o writer, boolean value) throws IOException {
            Intrinsics.j(writer, "writer");
            writer.g(value ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"hu/m$b", "Lcom/squareup/wire/ProtoAdapter;", "Lgw/h;", "value", "", "o", "(Lgw/h;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Lgw/h;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Lgw/h;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends ProtoAdapter<C14419h> {
        b(hu.d dVar, KClass<C14419h> kClass, hu.q qVar, C14419h c14419h) {
            super(dVar, kClass, null, qVar, c14419h, null, 32, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C14419h c(hu.n reader) {
            Intrinsics.j(reader, "reader");
            return reader.j();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(hu.o writer, C14419h value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            writer.a(value);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(C14419h value) {
            Intrinsics.j(value, "value");
            return value.V();
        }
    }

    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u00020\u0011*\u00060\u0002j\u0002`\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u00020\u0005*\u00060\u0002j\u0002`\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0017"}, d2 = {"hu/m$c", "Lcom/squareup/wire/ProtoAdapter;", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "value", "", "o", "(Lj$/time/Duration;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Lj$/time/Duration;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Lj$/time/Duration;", "", "q", "(Lj$/time/Duration;)J", "sameSignSeconds", "p", "sameSignNanos", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c extends ProtoAdapter<Duration> {
        c(hu.d dVar, KClass<Duration> kClass, hu.q qVar) {
            super(dVar, kClass, "type.googleapis.com/google.protobuf.Duration", qVar, null, null, 48, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Duration c(hu.n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            long jD = reader.d();
            long jLongValue = 0;
            int iIntValue = 0;
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    reader.e(jD);
                    Duration durationOfSeconds = Duration.ofSeconds(jLongValue, iIntValue);
                    Intrinsics.i(durationOfSeconds, "ofSeconds(...)");
                    return durationOfSeconds;
                }
                if (iH == 1) {
                    jLongValue = ProtoAdapter.f127460u.c(reader).longValue();
                } else if (iH != 2) {
                    reader.n(iH);
                } else {
                    iIntValue = ProtoAdapter.f127450k.c(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(hu.o writer, Duration value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            long jQ = q(value);
            if (jQ != 0) {
                ProtoAdapter.f127460u.f(writer, 1, Long.valueOf(jQ));
            }
            int iP = p(value);
            if (iP != 0) {
                ProtoAdapter.f127450k.f(writer, 2, Integer.valueOf(iP));
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(Duration value) {
            Intrinsics.j(value, "value");
            long jQ = q(value);
            int iH = jQ != 0 ? ProtoAdapter.f127460u.h(1, Long.valueOf(jQ)) : 0;
            int iP = p(value);
            return iP != 0 ? iH + ProtoAdapter.f127450k.h(2, Integer.valueOf(iP)) : iH;
        }

        private final int p(Duration duration) {
            if (duration.getSeconds() < 0 && duration.getNano() != 0) {
                return duration.getNano() - 1000000000;
            }
            return duration.getNano();
        }

        private final long q(Duration duration) {
            if (duration.getSeconds() < 0 && duration.getNano() != 0) {
                return duration.getSeconds() + 1;
            }
            return duration.getSeconds();
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"hu/m$d", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "o", "(Lkotlin/Unit;)I", "Lhu/o;", "writer", "n", "(Lhu/o;Lkotlin/Unit;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)V", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d extends ProtoAdapter<Unit> {
        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(hu.o writer, Unit value) {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(Unit value) {
            Intrinsics.j(value, "value");
            return 0;
        }

        d(hu.d dVar, KClass<Unit> kClass, hu.q qVar) {
            super(dVar, kClass, "type.googleapis.com/google.protobuf.Empty", qVar, null, null, 48, null);
        }

        public void m(hu.n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            long jD = reader.d();
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    reader.e(jD);
                    return;
                }
                reader.n(iH);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Unit c(hu.n nVar) throws IOException {
            m(nVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"hu/m$e", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "o", "(I)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;I)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/lang/Integer;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends ProtoAdapter<Integer> {
        e(hu.d dVar, KClass<Integer> kClass, hu.q qVar) {
            super(dVar, kClass, null, qVar, 0, null, 32, null);
        }

        public int o(int value) {
            return 4;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void e(hu.o oVar, Integer num) throws IOException {
            n(oVar, num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int g(Integer num) {
            return o(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer c(hu.n reader) {
            Intrinsics.j(reader, "reader");
            return Integer.valueOf(reader.k());
        }

        public void n(hu.o writer, int value) throws IOException {
            Intrinsics.j(writer, "writer");
            writer.b(value);
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"hu/m$f", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "o", "(J)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;J)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/lang/Long;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends ProtoAdapter<Long> {
        f(hu.d dVar, KClass<Long> kClass, hu.q qVar) {
            super(dVar, kClass, null, qVar, 0L, null, 32, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void e(hu.o oVar, Long l10) throws IOException {
            n(oVar, l10.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int g(Long l10) {
            return o(l10.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Long c(hu.n reader) {
            Intrinsics.j(reader, "reader");
            return Long.valueOf(reader.l());
        }

        public void n(hu.o writer, long value) throws IOException {
            Intrinsics.j(writer, "writer");
            writer.c(value);
        }

        public int o(long value) {
            return 8;
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"hu/m$g", "Lcom/squareup/wire/ProtoAdapter;", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "value", "", "o", "(Lj$/time/Instant;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Lj$/time/Instant;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Lj$/time/Instant;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class g extends ProtoAdapter<Instant> {
        g(hu.d dVar, KClass<Instant> kClass, hu.q qVar) {
            super(dVar, kClass, "type.googleapis.com/google.protobuf.Timestamp", qVar, null, null, 48, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Instant c(hu.n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            long jD = reader.d();
            long jLongValue = 0;
            int iIntValue = 0;
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    reader.e(jD);
                    Instant instantOfEpochSecond = Instant.ofEpochSecond(jLongValue, iIntValue);
                    Intrinsics.i(instantOfEpochSecond, "ofEpochSecond(...)");
                    return instantOfEpochSecond;
                }
                if (iH == 1) {
                    jLongValue = ProtoAdapter.f127460u.c(reader).longValue();
                } else if (iH != 2) {
                    reader.n(iH);
                } else {
                    iIntValue = ProtoAdapter.f127450k.c(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(hu.o writer, Instant value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            long epochSecond = value.getEpochSecond();
            if (epochSecond != 0) {
                ProtoAdapter.f127460u.f(writer, 1, Long.valueOf(epochSecond));
            }
            int nano = value.getNano();
            if (nano != 0) {
                ProtoAdapter.f127450k.f(writer, 2, Integer.valueOf(nano));
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(Instant value) {
            Intrinsics.j(value, "value");
            long epochSecond = value.getEpochSecond();
            int iH = epochSecond != 0 ? ProtoAdapter.f127460u.h(1, Long.valueOf(epochSecond)) : 0;
            int nano = value.getNano();
            return nano != 0 ? iH + ProtoAdapter.f127450k.h(2, Integer.valueOf(nano)) : iH;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"hu/m$h", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "o", "(I)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;I)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/lang/Integer;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends ProtoAdapter<Integer> {
        h(hu.d dVar, KClass<Integer> kClass, hu.q qVar) {
            super(dVar, kClass, null, qVar, 0, null, 32, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void e(hu.o oVar, Integer num) throws IOException {
            n(oVar, num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int g(Integer num) {
            return o(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer c(hu.n reader) {
            Intrinsics.j(reader, "reader");
            return Integer.valueOf(reader.o());
        }

        public void n(hu.o writer, int value) throws IOException {
            Intrinsics.j(writer, "writer");
            writer.d(value);
        }

        public int o(int value) {
            return hu.o.INSTANCE.e(value);
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"hu/m$i", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "o", "(J)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;J)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/lang/Long;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends ProtoAdapter<Long> {
        i(hu.d dVar, KClass<Long> kClass, hu.q qVar) {
            super(dVar, kClass, null, qVar, 0L, null, 32, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void e(hu.o oVar, Long l10) throws IOException {
            n(oVar, l10.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int g(Long l10) {
            return o(l10.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Long c(hu.n reader) {
            Intrinsics.j(reader, "reader");
            return Long.valueOf(reader.p());
        }

        public void n(hu.o writer, long value) throws IOException {
            Intrinsics.j(writer, "writer");
            writer.h(value);
        }

        public int o(long value) {
            return hu.o.INSTANCE.i(value);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"hu/m$j", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "o", "(I)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;I)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/lang/Integer;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends ProtoAdapter<Integer> {
        j(hu.d dVar, KClass<Integer> kClass, hu.q qVar) {
            super(dVar, kClass, null, qVar, 0, null, 32, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void e(hu.o oVar, Integer num) throws IOException {
            n(oVar, num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int g(Integer num) {
            return o(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer c(hu.n reader) {
            Intrinsics.j(reader, "reader");
            return Integer.valueOf(hu.o.INSTANCE.a(reader.o()));
        }

        public void n(hu.o writer, int value) throws IOException {
            Intrinsics.j(writer, "writer");
            writer.g(hu.o.INSTANCE.c(value));
        }

        public int o(int value) {
            o.Companion companion = hu.o.INSTANCE;
            return companion.h(companion.c(value));
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"hu/m$k", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "o", "(J)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;J)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/lang/Long;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends ProtoAdapter<Long> {
        k(hu.d dVar, KClass<Long> kClass, hu.q qVar) {
            super(dVar, kClass, null, qVar, 0L, null, 32, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void e(hu.o oVar, Long l10) throws IOException {
            n(oVar, l10.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int g(Long l10) {
            return o(l10.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Long c(hu.n reader) {
            Intrinsics.j(reader, "reader");
            return Long.valueOf(hu.o.INSTANCE.b(reader.p()));
        }

        public void n(hu.o writer, long value) throws IOException {
            Intrinsics.j(writer, "writer");
            writer.h(hu.o.INSTANCE.d(value));
        }

        public int o(long value) {
            o.Companion companion = hu.o.INSTANCE;
            return companion.i(companion.d(value));
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"hu/m$l", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "o", "(Ljava/lang/String;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Ljava/lang/String;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/lang/String;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class l extends ProtoAdapter<String> {
        l(hu.d dVar, KClass<String> kClass, hu.q qVar) {
            super(dVar, kClass, null, qVar, "", null, 32, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public String c(hu.n reader) {
            Intrinsics.j(reader, "reader");
            return reader.m();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(hu.o writer, String value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            writer.e(value);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(String value) {
            Intrinsics.j(value, "value");
            return (int) M.b(value, 0, 0, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"hu/m$m", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "o", "(Ljava/util/List;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Ljava/util/List;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/util/List;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hu.m$m, reason: collision with other inner class name */
    public static final class C2158m extends ProtoAdapter<List<?>> {
        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(List<?> value) {
            int iH = 0;
            if (value == null) {
                return 0;
            }
            Iterator<?> it = value.iterator();
            while (it.hasNext()) {
                iH += ProtoAdapter.f127436O.h(1, it.next());
            }
            return iH;
        }

        C2158m(hu.d dVar, KClass<Map<?, ?>> kClass, hu.q qVar) {
            super(dVar, kClass, "type.googleapis.com/google.protobuf.ListValue", qVar, null, null, 48, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List<?> c(hu.n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    reader.e(jD);
                    return arrayList;
                }
                if (iH != 1) {
                    reader.q();
                } else {
                    arrayList.add(ProtoAdapter.f127436O.c(reader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(hu.o writer, List<?> value) throws IOException {
            Intrinsics.j(writer, "writer");
            if (value == null) {
                return;
            }
            Iterator<?> it = value.iterator();
            while (it.hasNext()) {
                ProtoAdapter.f127436O.f(writer, 1, it.next());
            }
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"hu/m$n", "Lcom/squareup/wire/ProtoAdapter;", "", "", "value", "", "o", "(Ljava/util/Map;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Ljava/util/Map;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/util/Map;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class n extends ProtoAdapter<Map<String, ?>> {
        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(Map<String, ?> value) {
            int iG = 0;
            if (value == null) {
                return 0;
            }
            for (Map.Entry<String, ?> entry : value.entrySet()) {
                int iH = ProtoAdapter.f127431J.h(1, entry.getKey()) + ProtoAdapter.f127436O.h(2, entry.getValue());
                o.Companion companion = hu.o.INSTANCE;
                iG += companion.g(1) + companion.h(iH) + iH;
            }
            return iG;
        }

        n(hu.d dVar, KClass<Map<?, ?>> kClass, hu.q qVar) {
            super(dVar, kClass, "type.googleapis.com/google.protobuf.Struct", qVar, null, null, 48, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Map<String, ?> c(hu.n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jD = reader.d();
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    reader.e(jD);
                    return linkedHashMap;
                }
                if (iH != 1) {
                    reader.q();
                } else {
                    long jD2 = reader.d();
                    String strC = null;
                    Object objC = null;
                    while (true) {
                        int iH2 = reader.h();
                        if (iH2 == -1) {
                            break;
                        }
                        if (iH2 == 1) {
                            strC = ProtoAdapter.f127431J.c(reader);
                        } else if (iH2 != 2) {
                            reader.n(iH2);
                        } else {
                            objC = ProtoAdapter.f127436O.c(reader);
                        }
                    }
                    reader.e(jD2);
                    if (strC != null) {
                        linkedHashMap.put(strC, objC);
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(hu.o writer, Map<String, ?> value) throws IOException {
            Intrinsics.j(writer, "writer");
            if (value == null) {
                return;
            }
            for (Map.Entry<String, ?> entry : value.entrySet()) {
                String key = entry.getKey();
                Object value2 = entry.getValue();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.f127431J;
                int iH = protoAdapter.h(1, key);
                ProtoAdapter<Object> protoAdapter2 = ProtoAdapter.f127436O;
                int iH2 = iH + protoAdapter2.h(2, value2);
                writer.f(1, hu.d.f136160e);
                writer.g(iH2);
                protoAdapter.f(writer, 1, key);
                protoAdapter2.f(writer, 2, value2);
            }
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"hu/m$o", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "p", "(Ljava/lang/Void;)I", "tag", "q", "(ILjava/lang/Void;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Ljava/lang/Void;)V", "o", "(Lhu/o;ILjava/lang/Void;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/lang/Void;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class o extends ProtoAdapter {
        o(hu.d dVar, KClass kClass, hu.q qVar) {
            super(dVar, kClass, "type.googleapis.com/google.protobuf.NullValue", qVar, null, null, 48, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Void c(hu.n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            int iO = reader.o();
            if (iO == 0) {
                return null;
            }
            throw new IOException("expected 0 but was " + iO);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(hu.o writer, Void value) throws IOException {
            Intrinsics.j(writer, "writer");
            writer.g(0);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public void f(hu.o writer, int tag, Void value) throws IOException {
            Intrinsics.j(writer, "writer");
            writer.f(tag, getFieldEncoding());
            e(writer, value);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public int g(Void value) {
            return hu.o.INSTANCE.h(0);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public int h(int tag, Void value) {
            int iG = g(value);
            o.Companion companion = hu.o.INSTANCE;
            return companion.g(tag) + companion.h(iG);
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"hu/m$p", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "g", "(Ljava/lang/Object;)I", "tag", "h", "(ILjava/lang/Object;)I", "Lhu/o;", "writer", "", "e", "(Lhu/o;Ljava/lang/Object;)V", "f", "(Lhu/o;ILjava/lang/Object;)V", "Lhu/n;", "reader", "c", "(Lhu/n;)Ljava/lang/Object;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class p extends ProtoAdapter<Object> {
        p(hu.d dVar, KClass<Object> kClass, hu.q qVar) {
            super(dVar, kClass, "type.googleapis.com/google.protobuf.Value", qVar, null, null, 48, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Object c(hu.n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            long jD = reader.d();
            Object objC = null;
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    reader.e(jD);
                    return objC;
                }
                switch (iH) {
                    case 1:
                        objC = ProtoAdapter.f127435N.c(reader);
                        break;
                    case 2:
                        objC = ProtoAdapter.f127428G.c(reader);
                        break;
                    case 3:
                        objC = ProtoAdapter.f127431J.c(reader);
                        break;
                    case 4:
                        objC = ProtoAdapter.f127449j.c(reader);
                        break;
                    case 5:
                        objC = ProtoAdapter.f127433L.c(reader);
                        break;
                    case 6:
                        objC = ProtoAdapter.f127434M.c(reader);
                        break;
                    default:
                        reader.q();
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void e(hu.o writer, Object value) throws IOException {
            Intrinsics.j(writer, "writer");
            if (value == null) {
                ProtoAdapter.f127435N.f(writer, 1, value);
                return;
            }
            if (value instanceof Number) {
                ProtoAdapter.f127428G.f(writer, 2, Double.valueOf(((Number) value).doubleValue()));
                return;
            }
            if (value instanceof String) {
                ProtoAdapter.f127431J.f(writer, 3, value);
                return;
            }
            if (value instanceof Boolean) {
                ProtoAdapter.f127449j.f(writer, 4, value);
                return;
            }
            if (value instanceof Map) {
                ProtoAdapter<Map<String, ?>> protoAdapter = ProtoAdapter.f127433L;
                Intrinsics.h(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                protoAdapter.f(writer, 5, (Map) value);
            } else {
                if (value instanceof List) {
                    ProtoAdapter.f127434M.f(writer, 6, value);
                    return;
                }
                throw new IllegalArgumentException("unexpected struct value: " + value);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void f(hu.o writer, int tag, Object value) throws IOException {
            Intrinsics.j(writer, "writer");
            if (value != null) {
                super.f(writer, tag, value);
                return;
            }
            writer.f(tag, getFieldEncoding());
            writer.g(g(value));
            e(writer, value);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int g(Object value) {
            if (value == null) {
                return ProtoAdapter.f127435N.h(1, value);
            }
            if (value instanceof Number) {
                return ProtoAdapter.f127428G.h(2, Double.valueOf(((Number) value).doubleValue()));
            }
            if (value instanceof String) {
                return ProtoAdapter.f127431J.h(3, value);
            }
            if (value instanceof Boolean) {
                return ProtoAdapter.f127449j.h(4, value);
            }
            if (value instanceof Map) {
                ProtoAdapter<Map<String, ?>> protoAdapter = ProtoAdapter.f127433L;
                Intrinsics.h(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                return protoAdapter.h(5, (Map) value);
            }
            if (value instanceof List) {
                return ProtoAdapter.f127434M.h(6, value);
            }
            throw new IllegalArgumentException("unexpected struct value: " + value);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int h(int tag, Object value) {
            if (value != null) {
                return super.h(tag, value);
            }
            int iG = g(value);
            o.Companion companion = hu.o.INSTANCE;
            return companion.g(tag) + companion.h(iG) + iG;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"hu/m$q", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "o", "(I)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;I)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/lang/Integer;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class q extends ProtoAdapter<Integer> {
        q(hu.d dVar, KClass<Integer> kClass, hu.q qVar) {
            super(dVar, kClass, null, qVar, 0, null, 32, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void e(hu.o oVar, Integer num) throws IOException {
            n(oVar, num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int g(Integer num) {
            return o(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer c(hu.n reader) {
            Intrinsics.j(reader, "reader");
            return Integer.valueOf(reader.o());
        }

        public void n(hu.o writer, int value) throws IOException {
            Intrinsics.j(writer, "writer");
            writer.g(value);
        }

        public int o(int value) {
            return hu.o.INSTANCE.h(value);
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"hu/m$r", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "o", "(J)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;J)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/lang/Long;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class r extends ProtoAdapter<Long> {
        r(hu.d dVar, KClass<Long> kClass, hu.q qVar) {
            super(dVar, kClass, null, qVar, 0L, null, 32, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void e(hu.o oVar, Long l10) throws IOException {
            n(oVar, l10.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int g(Long l10) {
            return o(l10.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Long c(hu.n reader) {
            Intrinsics.j(reader, "reader");
            return Long.valueOf(reader.p());
        }

        public void n(hu.o writer, long value) throws IOException {
            Intrinsics.j(writer, "writer");
            writer.h(value);
        }

        public int o(long value) {
            return hu.o.INSTANCE.i(value);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"hu/m$s", "Lcom/squareup/wire/ProtoAdapter;", "value", "", "g", "(Ljava/lang/Object;)I", "Lhu/o;", "writer", "", "e", "(Lhu/o;Ljava/lang/Object;)V", "Lhu/n;", "reader", "c", "(Lhu/n;)Ljava/lang/Object;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class s<T> extends ProtoAdapter<T> {

        /* renamed from: a0, reason: collision with root package name */
        final /* synthetic */ ProtoAdapter<T> f136176a0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, ProtoAdapter<T> protoAdapter, hu.d dVar, KClass<?> kClass, hu.q qVar, T t10) {
            super(dVar, kClass, str, qVar, t10, null, 32, null);
            this.f136176a0 = protoAdapter;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public T c(hu.n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            T tJ = this.f136176a0.j();
            ProtoAdapter<T> protoAdapter = this.f136176a0;
            long jD = reader.d();
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    reader.e(jD);
                    return tJ;
                }
                if (iH == 1) {
                    tJ = protoAdapter.c(reader);
                } else {
                    reader.n(iH);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void e(hu.o writer, T value) throws IOException {
            Intrinsics.j(writer, "writer");
            if (value == null || Intrinsics.e(value, this.f136176a0.j())) {
                return;
            }
            this.f136176a0.f(writer, 1, value);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int g(T value) {
            if (value == null || Intrinsics.e(value, this.f136176a0.j())) {
                return 0;
            }
            return this.f136176a0.h(1, value);
        }
    }

    public static final ProtoAdapter<Boolean> a() {
        return new a(hu.d.f136158c, Reflection.b(Boolean.TYPE), hu.q.f136191c);
    }

    public static final ProtoAdapter<C14419h> b() {
        return new b(hu.d.f136160e, Reflection.b(C14419h.class), hu.q.f136191c, C14419h.f134558e);
    }

    public static final hu.b c() {
        return new hu.b();
    }

    public static final ProtoAdapter<Duration> d() {
        return new c(hu.d.f136160e, Reflection.b(Duration.class), hu.q.f136192d);
    }

    public static final ProtoAdapter<Unit> e() {
        return new d(hu.d.f136160e, Reflection.b(Unit.class), hu.q.f136192d);
    }

    public static final ProtoAdapter<Integer> f() {
        return new e(hu.d.f136161f, Reflection.b(Integer.TYPE), hu.q.f136191c);
    }

    public static final ProtoAdapter<Long> g() {
        return new f(hu.d.f136159d, Reflection.b(Long.TYPE), hu.q.f136191c);
    }

    public static final hu.f h() {
        return new hu.f();
    }

    public static final ProtoAdapter<Instant> i() {
        return new g(hu.d.f136160e, Reflection.b(Instant.class), hu.q.f136192d);
    }

    public static final ProtoAdapter<Integer> j() {
        return new h(hu.d.f136158c, Reflection.b(Integer.TYPE), hu.q.f136191c);
    }

    public static final ProtoAdapter<Long> k() {
        return new i(hu.d.f136158c, Reflection.b(Long.TYPE), hu.q.f136191c);
    }

    public static final ProtoAdapter<Integer> n() {
        return new j(hu.d.f136158c, Reflection.b(Integer.TYPE), hu.q.f136191c);
    }

    public static final ProtoAdapter<Long> o() {
        return new k(hu.d.f136158c, Reflection.b(Long.TYPE), hu.q.f136191c);
    }

    public static final ProtoAdapter<String> p() {
        return new l(hu.d.f136160e, Reflection.b(String.class), hu.q.f136191c);
    }

    public static final ProtoAdapter<List<?>> q() {
        return new C2158m(hu.d.f136160e, Reflection.b(Map.class), hu.q.f136192d);
    }

    public static final ProtoAdapter<Map<String, ?>> r() {
        return new n(hu.d.f136160e, Reflection.b(Map.class), hu.q.f136192d);
    }

    public static final ProtoAdapter s() {
        return new o(hu.d.f136158c, Reflection.b(Void.class), hu.q.f136192d);
    }

    public static final ProtoAdapter<Object> t() {
        return new p(hu.d.f136160e, Reflection.b(Object.class), hu.q.f136192d);
    }

    public static final ProtoAdapter<Integer> u() {
        return new q(hu.d.f136158c, Reflection.b(Integer.TYPE), hu.q.f136191c);
    }

    public static final ProtoAdapter<Long> v() {
        return new r(hu.d.f136158c, Reflection.b(Long.TYPE), hu.q.f136191c);
    }

    public static final <T> ProtoAdapter<T> w(ProtoAdapter<T> delegate, String typeUrl) {
        Intrinsics.j(delegate, "delegate");
        Intrinsics.j(typeUrl, "typeUrl");
        return new s(typeUrl, delegate, hu.d.f136160e, delegate.l(), hu.q.f136192d, delegate.j());
    }

    public static final ProtoAdapter<Integer> l() {
        return f();
    }

    public static final ProtoAdapter<Long> m() {
        return g();
    }
}
