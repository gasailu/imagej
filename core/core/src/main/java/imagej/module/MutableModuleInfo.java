/*
 * #%L
 * ImageJ software for multidimensional image processing and analysis.
 * %%
 * Copyright (C) 2009 - 2013 Board of Regents of the University of
 * Wisconsin-Madison, Broad Institute of MIT and Harvard, and Max Planck
 * Institute of Molecular Cell Biology and Genetics.
 * %%
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 * The views and conclusions contained in the software and documentation are
 * those of the authors and should not be interpreted as representing official
 * policies, either expressed or implied, of any organization.
 * #L%
 */

package imagej.module;

/**
 * {@link ModuleInfo} extension allowing manipulation of its metadata.
 * <p>
 * In particular, module inputs and outputs can be added, edited and removed.
 * </p>
 * <p>
 * Note that a {@code MutableModuleInfo} does not necessarily have
 * {@link MutableModuleItem}s!
 * </p>
 * 
 * @author Curtis Rueden
 * @see imagej.command.DynamicCommand
 */
public interface MutableModuleInfo extends ModuleInfo {

	/** Sets the module class described by this {@link ModuleInfo}. */
	void setModuleClass(Class<? extends Module> moduleClass);

	/** Gets the module class described by this {@link ModuleInfo}. */
	Class<? extends Module> getModuleClass();

	/** Adds an input to the list. */
	void addInput(ModuleItem<?> input);

	/** Adds an output to the list. */
	void addOutput(ModuleItem<?> output);

	/** Removes an input from the list. */
	void removeInput(ModuleItem<?> input);

	/** Removes an output from the list. */
	void removeOutput(ModuleItem<?> output);

}
