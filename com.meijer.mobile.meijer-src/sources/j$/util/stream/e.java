package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* loaded from: classes3.dex */
public final class e implements Collector {

    /* renamed from: a, reason: collision with root package name */
    public final a f139601a;

    /* renamed from: b, reason: collision with root package name */
    public final b f139602b;

    /* renamed from: c, reason: collision with root package name */
    public final c f139603c;

    /* renamed from: d, reason: collision with root package name */
    public final d f139604d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f139605e;

    public e(a aVar, b bVar, c cVar, d dVar, Set set) {
        this.f139601a = aVar;
        this.f139602b = bVar;
        this.f139603c = cVar;
        this.f139604d = dVar;
        this.f139605e = set;
    }

    @Override // java.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.f139602b;
    }

    @Override // java.util.stream.Collector
    public final Supplier supplier() {
        return this.f139601a;
    }

    @Override // java.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.f139603c;
    }

    @Override // java.util.stream.Collector
    public final Function finisher() {
        return this.f139604d;
    }

    @Override // java.util.stream.Collector
    public final Set characteristics() {
        return this.f139605e;
    }
}
