package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0017"}, d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "", "first", "last", "", "step", "<init>", "(CCI)V", "", "hasNext", "()Z", "a", "()C", "I", "getStep", "()I", "b", "finalElement", "c", "Z", "d", "next", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CharProgressionIterator extends CharIterator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int step;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int finalElement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int next;

    @Override // kotlin.collections.CharIterator
    public char a() {
        int i10 = this.next;
        if (i10 != this.finalElement) {
            this.next = this.step + i10;
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    public CharProgressionIterator(char c10, char c11, int i10) {
        this.step = i10;
        this.finalElement = c11;
        boolean z10 = false;
        if (i10 <= 0 ? Intrinsics.k(c10, c11) >= 0 : Intrinsics.k(c10, c11) <= 0) {
            z10 = true;
        }
        this.hasNext = z10;
        this.next = z10 ? c10 : c11;
    }
}
