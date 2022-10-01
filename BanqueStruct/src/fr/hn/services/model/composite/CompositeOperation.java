package fr.hn.services.model.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeOperation {
	protected List<Operation> children = new ArrayList<>();

	public CompositeOperation(final Operation... components) {
		add(components);
	}

	public void add(final Operation component) {
		children.add(component);
	}

	public void add(final Operation... components) {
		children.addAll(Arrays.asList(components));
	}

	public void remove(final Operation child) {
		children.remove(child);
	}

	public void remove(final Operation... components) {
		children.removeAll(Arrays.asList(components));
	}

	public void clear() {
		children.clear();
	}

	public List<Operation> getChildren() {
		return children;
	}

	public void setChildren(final List<Operation> children) {
		this.children = children;
	}

}
