package com.google.firebase.components;

import bf.C6245c;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: a, reason: collision with root package name */
    private final List<C6245c<?>> f88629a;

    public DependencyCycleException(List<C6245c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f88629a = list;
    }
}
