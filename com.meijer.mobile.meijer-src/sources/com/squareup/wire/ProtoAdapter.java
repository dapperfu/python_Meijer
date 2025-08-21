package com.squareup.wire;

import gw.C14419h;
import gw.InterfaceC14418g;
import gw.w;
import hu.C14576a;
import hu.b;
import hu.d;
import hu.e;
import hu.f;
import hu.g;
import hu.h;
import hu.j;
import hu.l;
import hu.m;
import hu.n;
import hu.o;
import hu.p;
import hu.q;
import j$.time.Duration;
import j$.time.Instant;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0019\b&\u0018\u0000 0*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002D-BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eB\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000fB1\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0010B;\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H&¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00028\u0000H&¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00028\u00002\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00028\u00002\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00028\u00002\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0\u0000¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u00102\u001a\u0004\b3\u00104R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u00105\u001a\u0004\b6\u00107R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u001c\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u00105\u001a\u0004\b>\u00107R(\u0010A\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,\u0018\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010?\u001a\u0004\b@\u0010.R(\u0010C\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,\u0018\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\bB\u0010.¨\u0006E"}, d2 = {"Lcom/squareup/wire/ProtoAdapter;", "E", "", "Lhu/d;", "fieldEncoding", "Lkotlin/reflect/KClass;", "type", "", "typeUrl", "Lhu/q;", "syntax", "identity", "sourceFile", "<init>", "(Lhu/d;Lkotlin/reflect/KClass;Ljava/lang/String;Lhu/q;Ljava/lang/Object;Ljava/lang/String;)V", "(Lhu/d;Lkotlin/reflect/KClass;)V", "(Lhu/d;Lkotlin/reflect/KClass;Ljava/lang/String;Lhu/q;)V", "(Lhu/d;Lkotlin/reflect/KClass;Ljava/lang/String;Lhu/q;Ljava/lang/Object;)V", "value", "", "g", "(Ljava/lang/Object;)I", "tag", "h", "(ILjava/lang/Object;)I", "Lhu/o;", "writer", "", "e", "(Lhu/o;Ljava/lang/Object;)V", "f", "(Lhu/o;ILjava/lang/Object;)V", "Lhu/n;", "reader", "c", "(Lhu/n;)Ljava/lang/Object;", "Lgw/g;", "source", "b", "(Lgw/g;)Ljava/lang/Object;", "Ljava/io/InputStream;", "stream", "d", "(Ljava/io/InputStream;)Ljava/lang/Object;", "", "a", "()Lcom/squareup/wire/ProtoAdapter;", "Lhu/d;", "i", "()Lhu/d;", "Lkotlin/reflect/KClass;", "l", "()Lkotlin/reflect/KClass;", "Ljava/lang/String;", "getTypeUrl", "()Ljava/lang/String;", "Lhu/q;", "k", "()Lhu/q;", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "getSourceFile", "Lcom/squareup/wire/ProtoAdapter;", "getPackedAdapter$wire_runtime", "packedAdapter", "getRepeatedAdapter$wire_runtime", "repeatedAdapter", "EnumConstantNotFoundException", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public abstract class ProtoAdapter<E> {

    /* renamed from: A, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Long> f127422A;

    /* renamed from: B, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<long[]> f127423B;

    /* renamed from: C, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Long> f127424C;

    /* renamed from: D, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<long[]> f127425D;

    /* renamed from: E, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Float> f127426E;

    /* renamed from: F, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<float[]> f127427F;

    /* renamed from: G, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Double> f127428G;

    /* renamed from: H, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<double[]> f127429H;

    /* renamed from: I, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<C14419h> f127430I;

    /* renamed from: J, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<String> f127431J;

    /* renamed from: K, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Unit> f127432K;

    /* renamed from: L, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Map<String, ?>> f127433L;

    /* renamed from: M, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<List<?>> f127434M;

    /* renamed from: N, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter f127435N;

    /* renamed from: O, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Object> f127436O;

    /* renamed from: P, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Double> f127437P;

    /* renamed from: Q, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Float> f127438Q;

    /* renamed from: R, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Long> f127439R;

    /* renamed from: S, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Long> f127440S;

    /* renamed from: T, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Integer> f127441T;

    /* renamed from: U, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Integer> f127442U;

    /* renamed from: V, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Boolean> f127443V;

    /* renamed from: W, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<String> f127444W;

    /* renamed from: X, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<C14419h> f127445X;

    /* renamed from: Y, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Duration> f127446Y;

    /* renamed from: Z, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Instant> f127447Z;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Boolean> f127449j;

    /* renamed from: k, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Integer> f127450k;

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<int[]> f127451l;

    /* renamed from: m, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Integer> f127452m;

    /* renamed from: n, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<int[]> f127453n;

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Integer> f127454o;

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<int[]> f127455p;

    /* renamed from: q, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Integer> f127456q;

    /* renamed from: r, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<int[]> f127457r;

    /* renamed from: s, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Integer> f127458s;

    /* renamed from: t, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<int[]> f127459t;

    /* renamed from: u, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Long> f127460u;

    /* renamed from: v, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<long[]> f127461v;

    /* renamed from: w, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Long> f127462w;

    /* renamed from: x, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<long[]> f127463x;

    /* renamed from: y, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<Long> f127464y;

    /* renamed from: z, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<long[]> f127465z;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d fieldEncoding;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final KClass<?> type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String typeUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q syntax;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final E identity;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String sourceFile;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ProtoAdapter<List<E>> packedAdapter;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ProtoAdapter<List<E>> repeatedAdapter;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "value", "Lkotlin/reflect/KClass;", "type", "<init>", "(ILkotlin/reflect/KClass;)V", "a", "I", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EnumConstantNotFoundException extends IllegalArgumentException {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final int value;

        public EnumConstantNotFoundException(int i10, KClass<?> kClass) {
            Class clsB;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown enum tag ");
            sb2.append(i10);
            sb2.append(" for ");
            sb2.append((kClass == null || (clsB = JvmClassMappingKt.b(kClass)) == null) ? null : clsB.getName());
            super(sb2.toString());
            this.value = i10;
        }
    }

    @Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\u0006\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000eR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u000eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u000eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u000eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u000eR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u000eR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u000eR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u000eR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u000eR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u000eR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u000eR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\u000eR\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u000eR\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\u000eR&\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0002\b\u0003\u0018\u00010\t0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010\u000eR \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u0001060\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010\u000eR\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u000eR\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u000eR\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u000eR\u001c\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010\u000eR\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010\u000eR\u001c\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010\u000eR\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010\u000eR\u001c\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010\u000eR\u001c\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u000eR\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\u000eR\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\u000eR\u001e\u0010F\u001a\f\u0012\b\u0012\u00060Dj\u0002`E0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010\u000eR\u001e\u0010I\u001a\f\u0012\b\u0012\u00060Gj\u0002`H0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010\u000e¨\u0006J"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$a;", "", "<init>", "()V", "K", "V", "Lcom/squareup/wire/ProtoAdapter;", "keyAdapter", "valueAdapter", "", "a", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)Lcom/squareup/wire/ProtoAdapter;", "", "BOOL", "Lcom/squareup/wire/ProtoAdapter;", "", "INT32", "", "INT32_ARRAY", "UINT32", "UINT32_ARRAY", "SINT32", "SINT32_ARRAY", "FIXED32", "FIXED32_ARRAY", "SFIXED32", "SFIXED32_ARRAY", "", "INT64", "", "INT64_ARRAY", "UINT64", "UINT64_ARRAY", "SINT64", "SINT64_ARRAY", "FIXED64", "FIXED64_ARRAY", "SFIXED64", "SFIXED64_ARRAY", "", "FLOAT", "", "FLOAT_ARRAY", "", "DOUBLE", "", "DOUBLE_ARRAY", "Lgw/h;", "BYTES", "", "STRING", "", "EMPTY", "STRUCT_MAP", "", "STRUCT_LIST", "", "STRUCT_NULL", "STRUCT_VALUE", "DOUBLE_VALUE", "FLOAT_VALUE", "INT64_VALUE", "UINT64_VALUE", "INT32_VALUE", "UINT32_VALUE", "BOOL_VALUE", "STRING_VALUE", "BYTES_VALUE", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "DURATION", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "INSTANT", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.squareup.wire.ProtoAdapter$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$a$a;", "Lcom/squareup/wire/ProtoAdapter;", "", "<init>", "()V", "value", "o", "(Ljava/lang/Void;)Ljava/lang/Void;", "Lhu/o;", "writer", "n", "(Lhu/o;Ljava/lang/Void;)Ljava/lang/Void;", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/lang/Void;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.squareup.wire.ProtoAdapter$a$a, reason: collision with other inner class name */
        public static final class C1992a extends ProtoAdapter {
            public C1992a() {
                super(d.f136160e, Reflection.b(Void.class));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int g(Object obj) {
                return ((Number) o((Void) obj)).intValue();
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Void c(n reader) {
                Intrinsics.j(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public Void e(o writer, Void value) {
                Intrinsics.j(writer, "writer");
                Intrinsics.j(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            public Void o(Void value) {
                Intrinsics.j(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final <K, V> ProtoAdapter<Map<K, V>> a(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
            Intrinsics.j(keyAdapter, "keyAdapter");
            Intrinsics.j(valueAdapter, "valueAdapter");
            return new j(keyAdapter, valueAdapter);
        }
    }

    public ProtoAdapter(d fieldEncoding, KClass<?> kClass, String str, q syntax, E e10, String str2) {
        l lVar;
        d dVar;
        Intrinsics.j(fieldEncoding, "fieldEncoding");
        Intrinsics.j(syntax, "syntax");
        this.fieldEncoding = fieldEncoding;
        this.type = kClass;
        this.typeUrl = str;
        this.syntax = syntax;
        this.identity = e10;
        this.sourceFile = str2;
        boolean z10 = this instanceof l;
        p pVar = null;
        if (z10 || (this instanceof p) || fieldEncoding == (dVar = d.f136160e)) {
            lVar = null;
        } else {
            if (getFieldEncoding() == dVar) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.");
            }
            lVar = new l(this);
        }
        this.packedAdapter = lVar;
        if (!(this instanceof p) && !z10) {
            pVar = new p(this);
        }
        this.repeatedAdapter = pVar;
    }

    public abstract E c(n reader) throws IOException;

    public abstract void e(o writer, E value) throws IOException;

    public abstract int g(E value);

    static {
        ProtoAdapter<Duration> c1992a;
        ProtoAdapter<Instant> c1992a2;
        ProtoAdapter<Boolean> protoAdapterA = m.a();
        f127449j = protoAdapterA;
        ProtoAdapter<Integer> protoAdapterJ = m.j();
        f127450k = protoAdapterJ;
        f127451l = new g(protoAdapterJ);
        ProtoAdapter<Integer> protoAdapterU = m.u();
        f127452m = protoAdapterU;
        f127453n = new g(protoAdapterU);
        ProtoAdapter<Integer> protoAdapterN = m.n();
        f127454o = protoAdapterN;
        f127455p = new g(protoAdapterN);
        ProtoAdapter<Integer> protoAdapterF = m.f();
        f127456q = protoAdapterF;
        f127457r = new g(protoAdapterF);
        ProtoAdapter<Integer> protoAdapterL = m.l();
        f127458s = protoAdapterL;
        f127459t = new g(protoAdapterL);
        ProtoAdapter<Long> protoAdapterK = m.k();
        f127460u = protoAdapterK;
        f127461v = new h(protoAdapterK);
        ProtoAdapter<Long> protoAdapterV = m.v();
        f127462w = protoAdapterV;
        f127463x = new h(protoAdapterV);
        ProtoAdapter<Long> protoAdapterO = m.o();
        f127464y = protoAdapterO;
        f127465z = new h(protoAdapterO);
        ProtoAdapter<Long> protoAdapterG = m.g();
        f127422A = protoAdapterG;
        f127423B = new h(protoAdapterG);
        ProtoAdapter<Long> protoAdapterM = m.m();
        f127424C = protoAdapterM;
        f127425D = new h(protoAdapterM);
        f fVarH = m.h();
        f127426E = fVarH;
        f127427F = new e(fVarH);
        b bVarC = m.c();
        f127428G = bVarC;
        f127429H = new C14576a(bVarC);
        ProtoAdapter<C14419h> protoAdapterB = m.b();
        f127430I = protoAdapterB;
        ProtoAdapter<String> protoAdapterP = m.p();
        f127431J = protoAdapterP;
        f127432K = m.e();
        f127433L = m.r();
        f127434M = m.q();
        f127435N = m.s();
        f127436O = m.t();
        f127437P = m.w(bVarC, "type.googleapis.com/google.protobuf.DoubleValue");
        f127438Q = m.w(fVarH, "type.googleapis.com/google.protobuf.FloatValue");
        f127439R = m.w(protoAdapterK, "type.googleapis.com/google.protobuf.Int64Value");
        f127440S = m.w(protoAdapterV, "type.googleapis.com/google.protobuf.UInt64Value");
        f127441T = m.w(protoAdapterJ, "type.googleapis.com/google.protobuf.Int32Value");
        f127442U = m.w(protoAdapterU, "type.googleapis.com/google.protobuf.UInt32Value");
        f127443V = m.w(protoAdapterA, "type.googleapis.com/google.protobuf.BoolValue");
        f127444W = m.w(protoAdapterP, "type.googleapis.com/google.protobuf.StringValue");
        f127445X = m.w(protoAdapterB, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            c1992a = m.d();
        } catch (NoClassDefFoundError unused) {
            c1992a = new Companion.C1992a();
        }
        f127446Y = c1992a;
        try {
            c1992a2 = m.i();
        } catch (NoClassDefFoundError unused2) {
            c1992a2 = new Companion.C1992a();
        }
        f127447Z = c1992a2;
    }

    public final ProtoAdapter<List<E>> a() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public final E b(InterfaceC14418g source) throws IOException {
        Intrinsics.j(source, "source");
        return c(new n(source));
    }

    public final E d(InputStream stream) throws IOException {
        Intrinsics.j(stream, "stream");
        return b(w.c(w.i(stream)));
    }

    public void f(o writer, int tag, E value) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value != null) {
            writer.f(tag, getFieldEncoding());
            if (getFieldEncoding() == d.f136160e) {
                writer.g(g(value));
            }
            e(writer, value);
        }
    }

    public int h(int tag, E value) {
        if (value == null) {
            return 0;
        }
        int iG = g(value);
        if (getFieldEncoding() == d.f136160e) {
            iG += o.INSTANCE.h(iG);
        }
        return iG + o.INSTANCE.g(tag);
    }

    /* renamed from: i, reason: from getter */
    public final d getFieldEncoding() {
        return this.fieldEncoding;
    }

    public final E j() {
        return this.identity;
    }

    /* renamed from: k, reason: from getter */
    public final q getSyntax() {
        return this.syntax;
    }

    public final KClass<?> l() {
        return this.type;
    }

    public /* synthetic */ ProtoAdapter(d dVar, KClass kClass, String str, q qVar, Object obj, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, kClass, str, qVar, (i10 & 16) != 0 ? null : obj, (i10 & 32) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(d fieldEncoding, KClass<?> kClass) {
        this(fieldEncoding, kClass, null, q.f136191c);
        Intrinsics.j(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(d fieldEncoding, KClass<?> kClass, String str, q syntax) {
        this(fieldEncoding, kClass, str, syntax, null);
        Intrinsics.j(fieldEncoding, "fieldEncoding");
        Intrinsics.j(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(d fieldEncoding, KClass<?> kClass, String str, q syntax, E e10) {
        this(fieldEncoding, kClass, str, syntax, e10, null);
        Intrinsics.j(fieldEncoding, "fieldEncoding");
        Intrinsics.j(syntax, "syntax");
    }
}
