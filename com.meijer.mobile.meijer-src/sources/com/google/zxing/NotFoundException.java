package com.google.zxing;

/* loaded from: classes8.dex */
public final class NotFoundException extends ReaderException {

    /* renamed from: c, reason: collision with root package name */
    private static final NotFoundException f91603c;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f91603c = notFoundException;
        notFoundException.setStackTrace(ReaderException.f91605b);
    }

    public static NotFoundException a() {
        return ReaderException.f91604a ? new NotFoundException() : f91603c;
    }

    private NotFoundException() {
    }
}
