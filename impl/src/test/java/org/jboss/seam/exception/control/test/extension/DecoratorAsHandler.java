/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.seam.exception.control.test.extension;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.el.ELResolver;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

import org.jboss.seam.exception.control.CaughtException;
import org.jboss.seam.exception.control.Handles;
import org.jboss.seam.exception.control.HandlesExceptions;

/**
 * A decorator which declares itself as an exception handler, which is not allowed.
 */
@Decorator
@HandlesExceptions
public abstract class DecoratorAsHandler extends ELResolver
{
   @Inject
   @Delegate
   @Any
   private ELResolver delegate;

   public void handlesAll(@Handles CaughtException<Throwable> caught)
   {
   }
}
