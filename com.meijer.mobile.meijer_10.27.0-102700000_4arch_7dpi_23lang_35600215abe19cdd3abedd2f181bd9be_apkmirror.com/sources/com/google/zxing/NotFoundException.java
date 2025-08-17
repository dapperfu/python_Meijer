package com.google.zxing;

/* loaded from: classes7.dex */
public final class NotFoundException extends ReaderException {

    /* renamed from: c, reason: collision with root package name */
    private static final NotFoundException f90764c;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f90764c = notFoundException;
        notFoundException.setStackTrace(ReaderException.f90766b);
    }

    public static NotFoundException a() {
        return ReaderException.f90765a ? new NotFoundException() : f90764c;
    }

    private NotFoundException() {
    }
}
