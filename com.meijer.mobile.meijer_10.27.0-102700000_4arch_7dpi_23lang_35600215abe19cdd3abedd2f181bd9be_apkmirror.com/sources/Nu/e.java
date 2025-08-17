package Nu;

/* loaded from: classes9.dex */
final class e extends d<Runnable> {
    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }

    e(Runnable runnable) {
        super(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Nu.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Runnable runnable) {
        runnable.run();
    }
}
